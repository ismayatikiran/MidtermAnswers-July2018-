package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

         int i = 1;
         int j = 0;
        System.out.println("Fourty Fibonacci number are: ");
        for (int k = 1; k <= 40; k++){
            int sum = i + j;
            i = j;
            j = sum;
            System.out.println(sum + " ");


        }


    }
}
