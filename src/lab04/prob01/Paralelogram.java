package lab04.prob01;

public class Paralelogram extends Patrulater {

    public Paralelogram(int lat1, int lat2, double unghi1, double unghi2) {
        super(lat1, lat2, lat1, lat2, unghi1, unghi2, unghi1, unghi2);
    }

    // constructor pentru clasa Romb
    public Paralelogram(int latura) {
        super(latura, latura, latura, latura);
    }

    // constructor pentru clasa Dreptunghi
    public Paralelogram(int lungime, int latime) {
        super(lungime, latime, lungime, latime);
    }

    public double calculArie() {
        return latura1 * latura2 * Math.sin(Math.toRadians(unghi1));
    }
}
