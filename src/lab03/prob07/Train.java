package lab03.prob07;

public class Train {

    Route r;
    Schedule s;
    boolean local;

    Train(Route r, Schedule s, boolean local) {
        this.r = r;
        this.s = s;
        this.local = local;
    }

    double calculateTicketPrice() {
        // ternary operator: condition ? expression_if_true : expression_if_false;
        int x = (this.local) ? 1 : 2;
        return x * s.getJourneyDuration();
    }
}
