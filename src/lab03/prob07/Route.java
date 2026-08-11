package lab03.prob07;

public class Route {

    String origin;
    String destination;

    Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    // Checks if the two routes are a round-trip
    boolean isRoundTrip(Route other) {
        return this.origin.equals(other.destination) && this.destination.equals(other.origin);
    }
}
