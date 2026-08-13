package lab04.prob01;

public class Romb extends Paralelogram {

    double diag1, diag2;

    public Romb(int latura, double diag1, double diag2) {
        super(latura);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public double calculArie() {
        return (diag1 * diag2) / 2;
    }
}
