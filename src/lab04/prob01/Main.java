package lab04.prob01;

public class Main {

    public static void main(String[] args) {

        Paralelogram paralelogram = new Paralelogram(10, 6, 60,120);
        Romb romb = new Romb(10, 16, 12);
        Dreptunghi dreptunghi = new Dreptunghi(21, 16);
        Patrat patrat = new Patrat(25);

        System.out.println("Perimetru paralelogram = " + paralelogram.calculPerimetru());
        System.out.println("Arie paralelogram = " + paralelogram.calculArie());

        System.out.println("Perimetru romb = " + romb.calculPerimetru());
        System.out.println("Arie romb = " + romb.calculArie());

        System.out.println("Perimetru dreptunghi = " + dreptunghi.calculPerimetru());
        System.out.println("Arie dreptunghi = " + dreptunghi.calculArie());

        System.out.println("Perimetru patrat = " + patrat.calculPerimetru());
        System.out.println("Arie patrat = " + patrat.calculArie());
    }
}
