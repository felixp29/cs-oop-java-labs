package lab03.prob07;

public class Main {

    public static void main(String[] args) {

        ClockTime departure1 = new ClockTime(9, 35);
        ClockTime arrival1 = new ClockTime(12, 2);
        ClockTime departure2 = new ClockTime(5, 45);
        ClockTime arrival2 = new ClockTime(12, 49);
        ClockTime departure3 = new ClockTime(23, 58);
        ClockTime arrival3 = new ClockTime(17, 0);
        ClockTime departure4 = new ClockTime(15, 23);
        ClockTime arrival4 = new ClockTime(4, 52);
        ClockTime departure5 = new ClockTime(19, 1);
        ClockTime arrival5 = new ClockTime(10, 13);
        ClockTime departure6 = new ClockTime(10, 10);
        ClockTime arrival6 = new ClockTime(22, 7);

        Schedule schedule1 = new Schedule(departure1, arrival1);
        Schedule schedule2 = new Schedule(departure2, arrival2);
        Schedule schedule3 = new Schedule(departure3, arrival3);
        Schedule schedule4 = new Schedule(departure4, arrival4);
        Schedule schedule5 = new Schedule(departure5, arrival5);
        Schedule schedule6 = new Schedule(departure6, arrival6);

        Route route1 = new Route("Bucuresti Nord", "Constanta");
        Route route2 = new Route("Bucuresti Nord", "Galati");
        Route route3 = new Route("Bucuresti Nord", "Sofia");
        Route route4 = new Route("Arad", "Bucuresti Nord");
        Route route5 = new Route("Timisoara Vest", "Vienna");
        Route route6 = new Route("Vienna", "Timisoara Vest");

        Train train1 = new Train(route1, schedule1, true);
        Train train2 = new Train(route2, schedule2, true);
        Train train3 = new Train(route3, schedule3, false);
        Train train4 = new Train(route4, schedule4, true);
        Train train5 = new Train(route5, schedule5, false);
        Train train6 = new Train(route6, schedule6, false);

        System.out.println("The train ticket from Bucuresti Nord to Constanta costs " + train1.calculateTicketPrice() + " RON");
        System.out.println("The train ticket from Bucuresti Nord to Galati costs " + train2.calculateTicketPrice() + " RON");
        System.out.println("Is it a round-trip? " + route1.isRoundTrip(route2));

        System.out.println("The train ticket from Bucuresti Nord to Sodia costs " + train3.calculateTicketPrice() + " RON");
        System.out.println("The train ticket from Arad to Bucuresti Nord costs " + train4.calculateTicketPrice() + " RON");
        System.out.println("Is it a round-trip? " + route3.isRoundTrip(route4));

        System.out.println("The train ticket from Timisoara Vest to Vienna costs " + train5.calculateTicketPrice() + " RON");
        System.out.println("The train ticket from Vienna to Timisoara Vest costs " + train6.calculateTicketPrice() + " RON");
        System.out.println("Is it a round-trip? " + route5.isRoundTrip(route6));
    }
}
