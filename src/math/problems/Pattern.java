package math.problems;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) throws Exception {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int count = 1, j = 0;
		int num = 100;
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> storePattern = new ArrayList<String>();
		int[] array1 = new int[40];

		while (num > 0) {

			for (int i = 0; i < 10; i++) {
				System.out.println(" " + num);
				array1[j] = num;
				num -= count;
				j++;
			}
			count++;

		}
		System.out.println(" ");
		connectToSqlDB.insertDataFromArrayToSqlTable(array1, "tbl_pattern", "column_pattern");
		storePattern = connectToSqlDB.readDataBase("tbl_pattern", "column_pattern");
		System.out.println("Data is reading from the Table (tbl_pattern) and displaying to the console");
		for (String sp : storePattern) {
			System.out.print(" " + sp);
		}
	}
}