package lab03.prob05;

public class Punct {

    private int coordX;
    private int coordY;

    Punct() {
        this.coordX = 0;
        this.coordY = 0;
    }

    int getX() {
        return coordX;
    }

    int getY() {
        return coordY;
    }

    void setX(int x) {
        this.coordX = x;
    }

    void setY(int y) {
        this.coordY = y;
    }

    @Override
    public String toString() {
        return "(" + this.coordX + "," + this.coordY + ")";
    }

    double distance(int x, int y) {
        int dx = this.coordX - x;
        int dy = this.coordY - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    double distance(Punct p1) {
        /*
        int dx = this.coordX - p1.coordX;
        int dy = this.coordY - p1.coordY;
        return Math.sqrt(dx * dx + dy * dy);
         */
        return distance(p1.coordX, p1.coordY);
    }
}
