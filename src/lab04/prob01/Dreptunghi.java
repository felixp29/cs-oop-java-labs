package lab04.prob01;

public class Dreptunghi extends Paralelogram {

    public Dreptunghi(int lung, int lat) {
        super(lung, lat);
    }

    @Override
    public double calculArie() {
        return latura1 * latura2;
    }
}
