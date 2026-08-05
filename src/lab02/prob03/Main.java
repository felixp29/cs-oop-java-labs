package lab02.prob03;

import java.util.Vector;
import java.util.Random;

public class Main {

    static Vector vector = new Vector(20);
    static Random generator = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            int nr = generator.nextInt(11);
            vector.add(nr);
        }

        int min = (int) vector.get(0);
        int poz_min = 0;
        int max = (int) vector.get(0);
        int poz_max = 0;
        int suma = 0;
        double media = 0;

        for (int i = 0; i < vector.size(); i++) {
            int val = (int) vector.get(i);
            suma += val;
            if (val < min) {
                min = val;
                poz_min = i;
            }
            if (val > max) {
                max = val;
                poz_max = i;
            }
        }

        media = (double) suma / vector.size();

        System.out.println(vector);
        System.out.println("Cel mai mare element = " + max + ", la pozitia " + poz_max);
        System.out.println("Cel mai mic element = " + min + ", la pozitia " + poz_min);
        System.out.println("Media aritmetica a elementelor vectorului = " + media);

        int eliminate = eliminaSiNumara(vector, 5);

        System.out.println(vector);
        System.out.println(eliminate);
    }

    static int eliminaSiNumara(Vector vector, int x) {
        int count = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.elementAt(i).equals(x)) {
                vector.remove(i);
                count++;
                /* pentru ca vectorul se redimensioneaza automat cu -1 si
                 * ar sari peste urmatorul element, i-- ma asigura ca
                 * raman la acelasi index
                 */
                i--;
            }
        }
        return count;
    }
}
