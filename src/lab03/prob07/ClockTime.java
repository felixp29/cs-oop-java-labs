package lab03.prob07;

public class ClockTime {

    int hour;
    int minute;

    ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Returns the time difference in minutes from actual moment (this) and another moment (other)
    int compareTime(ClockTime other) {
        int totalMinutesThis = this.hour * 60 + this.minute;
        int totalMinutesOther = other.hour * 60 + other.minute;
        return totalMinutesThis - totalMinutesOther;
    }
}
