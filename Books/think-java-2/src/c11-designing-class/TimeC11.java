public class TimeC11 {
    private int hour;
    private int minute;
    private double second;

    public TimeC11() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public TimeC11(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void increment(double seconds) {
        this.second += seconds;
        this.minute += this.second % 60;
        this.second %= 60;
        this.hour += this.minute % 60;
        this.minute %= 60;
    }
}
