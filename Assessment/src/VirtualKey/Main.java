package VirtualKey;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> files = new ArrayList<String>();

	public static void main(String[] args) {

		System.out.println("\n**************************************************************\n");
		System.out.println("\t WELCOME TO THE VIRTUAL REPOSITORY\n");
		System.out.println("\t Developed by ABDUL BASITH\n");
		System.out.println("**************************************************************\n");

		selectoption();
	}

	public static void selectoption() {
		String arr[] = { "1. Retrieving the file names in an ascending order", "2. Business-level operations",
				"3. Close the apllication" };
		int arr1[] = { 1, 2, 3 };
		int len = Array.getLength(arr1);
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
		files.add("Document1.txt");
		files.add("Document2.txt");
		files.add("Document3.txt");
		files.add("Redlistfiles.txt");
		files.add("Greenlistfiles.txt");
		files.add("Yellowlistfiles.txt");
		files.add("Newentrylist.txt");
		files.add("upcomingprojectlist.txt");
		files.add("submittedprojectlist.txt");
		files.add("Aboutcustomerdetails.txt");
		System.out.println("\nEnter the choice:  ");

		int options = sc.nextInt();
		if(options == 1 || options == 2 || options == 3) {
		for (int j = 1; j <= len; j++) {
			if (options == j) {

				switch (options) {
				case 1:
					System.out.println("\nFiles are in ascending order : \n");
					sorting(files);
					System.out.println(files);
					break;
				case 2:
					operation();
					break;
				case 3:
					System.out.println("\nClosing the application");
					System.out.println("\nThank you......");
					break;
				default:
					System.out.println("Oops... press correct value");
				}
			}
		}}
		else {
			System.out.println("\nEnter the correct option\n");
			selectoption();
		}
	}

	public static void sorting(ArrayList<String> arraylist) {

		Set<String> s = new HashSet<String>();
		s.addAll(arraylist);
		arraylist.clear();
		arraylist.addAll(s);
		Collections.sort(arraylist);

		int len = arraylist.size();
		for (int i = 0; i < len; i++) {
			System.out.println("  " + arraylist.get(i));
			System.out.println();
		}
		System.out.println();
		selectoption();
	}

	public static void operation() {
		Businessoperation m = new Businessoperation();
		String arr[] = { "\n1. Add a file", "2. Delete the file from the list", "3. Search a file form the list",
				"4. Back to main menu" };
		int arr1[] = { 1, 2, 3, 4 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr[i]);
		}
		m.operation2();

	}

}
