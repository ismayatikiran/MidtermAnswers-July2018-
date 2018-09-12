package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {

		int[] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st : numbers) {
			printValue(numbers);
		}
		int n = num.length;

		randomize(num, n);


		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers1 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st : numbers1) {
			System.out.println(st);
		}
		randomize(num, n);


		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExcutionTime = algo.executionTime;
		System.out.println("Total Execution Time of" + num.length + " numbers in Bubble Sort take: " + bubbleSortExcutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers2 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st1 : numbers2) {
			System.out.println(st1);

		}
		randomize(num, n);


		//Merge Sort
		algo.mergeSort(num);
		long mergeSortExcutionTime = algo.executionTime;
		System.out.println("Total Execution Time of" + num.length + " numbers in Merge Sort take: " + mergeSortExcutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers3 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st1 : numbers3) {
			System.out.println(st1);
		}
		randomize(num, n);

		//Quick Sort

		algo.quickSort(num);
		long quickSortExcutionTime = algo.executionTime;
		System.out.println("Total Execution Time of" + num.length + " numbers in Quick Sort take: " + quickSortExcutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers4 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st1 : numbers4) {
			System.out.println(st1);
		}
		randomize(num, n);


		//Heap Sort
		algo.heapSort(num);
		long heapSortExcutionTime = algo.executionTime;
		System.out.println("Total Execution Time of" + num.length + " numbers in Heap Sort take: " + heapSortExcutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers5 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st1 : numbers5) {
			System.out.println(st1);
		}
		randomize(num, n);


		//Bucket Sort
		algo.heapSort(num);
		long bucketSortExcutionTime = algo.executionTime;
		System.out.println("Total Execution Time of" + num.length + " numbers in Bucket Sort take: " + bucketSortExcutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers6 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st1 : numbers6) {
			System.out.println(st1);
		}
		randomize(num, n);


		//Shell Sort
		algo.shellSort(num);
		long shellSortExcutionTime = algo.executionTime;
		System.out.println("Total Execution Time of" + num.length + " numbers in Shell Sort take: " + shellSortExcutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumber");
		List<String> numbers7 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st1 : numbers7) {
			System.out.println(st1);
		}


	}
	//By following above, Continue for rest of the Sorting Algorithm....


	//Come to conclusion about which Sorting Algo is better in given data set.


		public static void storeRandomNumbers ( int[] num){
			Random rand = new Random();
			for (int i = 0; i < num.length; i++) {
				num[i] = rand.nextInt(1000000);
			}
		}

		public static void randomize ( int arr[], int n) {
			Random r = new Random();


			// Start from the last element and swap one by one. We don't
			// need to run for the first element that's why i > 0
			for (int i = n-1; i > 0; i--) {
				int j = r.nextInt(i);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		public static int findLow(int[]array){
		int low = array[0];
		for (int n : array){
			if (array[n]<low){
				low = array[n];
			}
		}
		return low;

		}

	public static int findhigh(int[]array) {
		int high = array[0];
		for (int n : array) {
			if (array[n] > high) {
				high = array[n];
			}
		}
		return high;
	}
		public static void printValue (List < String > array) {
			for (String st : array) {
				System.out.println(st);
			}
		}
	}
