import java.util.*;
import java.util.concurrent.locks.*;
import static java.util.concurrent.TimeUnit.SECONDS;
class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank(new long[]{10, 100, 20, 50, 30});
        bank.withdraw(3, 10);
        bank.transfer(5, 1, 20);
        bank.deposit(5, 20);
        bank.transfer(3, 4, 15);
        bank.withdraw(10, 50);
        bank.updateAccounts();
    }

    private final Acc[] accs;

    public Bank(long[] balArr) {
        accs = new Acc[balArr.length];
        for (int i = 0; i < balArr.length; i++) accs[i] = new Acc(balArr[i], i + 1);
    }

    public boolean transfer(int fromId, int toId, long amt) {
        if (!isValid(fromId) || !isValid(toId) || amt < 0) return false;

        Acc from = getAcc(fromId);
        Acc to = getAcc(toId);

        try {
            if (from.lock.tryLock(1, SECONDS)) {
                try {
                    if (to.lock.tryLock(1, SECONDS)) {
                        try {
                            if (from.withdraw(amt)) {
                                if (to.deposit(amt)) {
                                    from.addTxn(new Txn(Txn.Type.WITHDRAW, amt, fromId));
                                    to.addTxn(new Txn(Txn.Type.DEPOSIT, amt, toId));
                                } else {
                                    from.deposit(amt);
                                    return false;
                                }
                            } else return false;
                        } finally {
                            to.lock.unlock();
                        }
                    }
                } finally {
                    from.lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return true;
    }

    public boolean deposit(int id, long amt) {
        if (!isValid(id)) return false;
        Acc a = getAcc(id);
        if (a.deposit(amt)) {
            a.addTxn(new Txn(Txn.Type.DEPOSIT, amt, id));
            return true;
        }
        return false;
    }

    public boolean withdraw(int id, long amt) {
        if (!isValid(id)) return false;
        Acc a = getAcc(id);
        if (a.withdraw(amt)) {
            a.addTxn(new Txn(Txn.Type.WITHDRAW, amt, id));
            return true;
        }
        return false;
    }

    private boolean isValid(int id) {
        return id > 0 && id <= accs.length;
    }

    private Acc getAcc(int id) {
        return accs[id - 1];
    }

    public static class Txn {
        public enum Type { DEPOSIT, WITHDRAW, MERGE }

        private final Type type;
        private final long amt;
        private final int accId;
        private final long time;

        public Txn(Type type, long amt, int accId) {
            this.type = type;
            this.amt = amt;
            this.accId = accId;
            this.time = System.currentTimeMillis();
        }

        @Override
        public String toString() {
            return "Txn{" + "type=" + type + ", amt=" + amt + ", accId=" + accId + ", time=" + time + '}';
        }
    }

    private static class Acc {
        private long bal;
        private long totalAmt = 0;
        private final Lock lock = new ReentrantLock(true);
        private final List<Txn> txns = new ArrayList<>();
        private final int id;

        public Acc(long bal, int id) {
            this.bal = bal;
            this.id = id;
        }

        public boolean deposit(long amt) {
            try {
                if (lock.tryLock(1, SECONDS)) {
                    try {
                        bal += amt;
                        totalAmt += amt;
                    } finally {
                        lock.unlock();
                    }
                    return true;
                }
            } catch (InterruptedException e) {
                return false;
            }
            return false;
        }

        public boolean withdraw(long amt) {
            try {
                if (lock.tryLock(1, SECONDS)) {
                    try {
                        if (bal < amt) return false;
                        bal -= amt;
                        totalAmt += amt;
                    } finally {
                        lock.unlock();
                    }
                    return true;
                }
            } catch (InterruptedException e) {
                return false;
            }
            return false;
        }

        public void addTxn(Txn txn) {
            txns.add(txn);
        }

        public long getBal() {
            return bal;
        }

        public long getTotalAmt() {
            return totalAmt;
        }
    }

    public void updateAccounts() {
        for (Acc a : accs) updateTop(a);
    }

    private void updateTop(Acc a) {
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */