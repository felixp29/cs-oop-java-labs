package lab01.prob08;

import java.util.Arrays;

public class Prob8 {

    public static void main(String[] args) {
        int[] vector = new int[12];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        Arrays.sort(vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.binarySearch(vector, 9999));
    }

    /* scalarea intervalului, urmata de o translatie a lui
    int min = 10, max = 20;
    int y = min + (int) (Math.random() * (max - min + 1)); // 10..20
     */
}
