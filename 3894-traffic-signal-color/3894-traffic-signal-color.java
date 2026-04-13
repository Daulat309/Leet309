class Solution {
    public String trafficSignal(int t) {
        if(t==0) return "Green";
        if(t==30) return "Orange";
        if(30<t&&t<=90) return "Red";
        return "Invalid";
    }
}