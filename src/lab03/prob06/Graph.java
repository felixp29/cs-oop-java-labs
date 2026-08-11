package lab03.prob06;

public class Graph {

    private int[][] matrice;
    private final int Infinit = 9500;
    private int n;

    Graph(int n) {
        this.n = n;
        this.matrice = new int[n + 1][n + 1];
    }

    int getSize() {
        return n;
    }

    void addArc(int v, int w, int cost) {
        matrice[v][w] = cost;
    }

    boolean isArc(int v, int w) {
        /*
        if (matrice[v][w] != 0) {
            return true;
        }
        else {
            return false;
        }
         */
        return (matrice[v][w] != 0);
    }

    @Override
    public String toString() {
        String reprezentare = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                reprezentare = reprezentare + matrice[i][j] + "\t";
            }
            reprezentare = reprezentare + "\n";
        }
        return reprezentare;
    }

    public int[][] floydWarshall() {
        int result[][];
        result = new int[n + 1][n + 1];
        int k, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    result[i][j] = 0;
                } else if (isArc(i, j)) {
                    result[i][j] = matrice[i][j];
                } else {
                    result[i][j] = Infinit;
                }
            }
        }
        for (k = 1; k <= n; k++) {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if (result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        // Graful din desen
        Graph g1 = new Graph(8);
        g1.addArc(1, 7, 15);
        g1.addArc(1, 5, 1);
        g1.addArc(5, 7, 2);
        g1.addArc(5, 6, 3);
        g1.addArc(6, 1, 6);
        g1.addArc(6,2, 1);
        g1.addArc(2,3,5);
        g1.addArc(3,6,7);
        g1.addArc(3,4,6);
        g1.addArc(4, 5,2);
        g1.addArc(8, 6,4);
        g1.addArc(8,5,2);
        System.out.println("Matricea de adiacenta:");
        System.out.println(g1);

        System.out.println("Floyd-Warshall:");
        int[][] matrix = g1.floydWarshall();
        System.out.println("Distanta minima de la 1 la 4 este: " + matrix[1][4]);

        //Graful din schelet
        Graph g2 = new Graph(4);
        g2.addArc(1, 3, 2);
        g2.addArc(1, 2, 3);
        g2.addArc(2, 4, 6);
        g2.addArc(2, 3, 2);
        System.out.println(g2);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g2.floydWarshall();
        System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[1][4]); // rezultat - 9
    }
}
