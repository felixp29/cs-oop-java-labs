package lab01.prob04;

public class Prob4 {

    public static void main(String[] args) {
        if (args.length == 0 ) {
            System.out.println("Nu s-au primit argumente");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(i + " " + args[i]);
            }
        }
    }
}
