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
        for (int x = 9; x > 0; x--) {
            int y;
            for (y = 0; y < x; y++) {
                System.out.println(" ");

            }
            for (int z = y; z < 10; z++) {
                System.out.println("* ");
            }
            System.out.println(" ");
        }
    }
}