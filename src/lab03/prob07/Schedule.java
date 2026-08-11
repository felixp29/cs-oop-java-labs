package lab03.prob07;

public class Schedule {

    ClockTime departure;
    ClockTime arrival;

    Schedule(ClockTime departure, ClockTime arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    int getJourneyDuration() {
        int duration = arrival.compareTime(departure);

        // if duration is negative it means that the train arrives the next day
        if (duration < 0) {
            // add one day = 24 hours = 1440 mins
            duration += 24 * 60;
        }
        return duration;
    }
}
