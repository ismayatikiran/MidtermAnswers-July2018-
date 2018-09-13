package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        int n = 10;
        printTriangle(n);

    }

    public static void printTriangle(int n) {
        int k = 2 * n - 2;

        for (int j = 0; i < k; j++) {

            for (int j = 0; j < k; j++) {
                System.out.println(" ");
            }

            k = k - 1;
            for (int j = 0; j <= i; j++) {
                System.out.println("* ");
            }
                System.out.println();

            }

        }

    }
