package datastructure;

import databases.ConnectToMongoDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader file = null;
		BufferedReader buffer = null;
		BufferedReader buffer1 = null;

		ConnectToMongoDB db = new ConnectToMongoDB();

		try {
			file = new FileReader(textFile);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		br = new BufferedReader(file);

		String text, text1 ;
		Stack stack = new Stack();
		LinkedList<String>linkedList = new LinkedList<>();
		int count = 0;

		try {
			while ((text = br.readLine()) != null) {


			}


		}


	}

}
