class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;
        double h = (double)(hour)*30.0 + (double)minutes*0.5;
        double m = (double)(minutes)*6.0;
        return Math.min((360.0-Math.abs(m - h)),Math.abs(m - h));
    }
}