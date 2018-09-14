package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		void sieveOfEratosthenes(int n)throw Exception {


			boolean prime[] = new boolean[n + 1];
			int j = 0;

			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
			List<String> storePattern = new ArrayList<String>();
			final long startTime = System.currentTimeMillis();

			for (int i = 0; i < n; i++)
				prime[i] = true;

				for (int p = 2; p * p <= n; p++) {
					if (prime[p] == true) {
						for (int i = p * 2; i <= n; i += p)
							prime[i] = false;
					}
				}

				for (int i = 2; i <= n; i++) {
					if (prime[i] == true) {
						array1[j] = i;
						System.out.println(i + " ");
						j++;

					}

				}
				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("\nExecution time for calculating prime number from 1,000,000 numbers: " + executionTime + " milliseconds");

				connectToSqlDB.insertDataFromArrayToSqlTable(array1, "table_prime_number", "column_prime_number");
				storePattern = connectToSqlDB.readDataBase("tbl_prime_number", "column_prime_number");
				System.out.println("Data is reading from the Table(tbl_prime_number) and displaying to the console");
				for (String st: storePattern){
					System.out.println((st + " ");
				}

			}

			public static void main(String[]args) throw Exception {
				 int n = 1000000;
				System.out.println("Following are the prime numbers");
				System.out.println("Smaller that or equal to" + n);


		PrimeNumber g = new PrimeNumber();
		g.sieveOfEratosthenes(n);
	}
	}
}
