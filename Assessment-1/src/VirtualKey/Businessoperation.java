package VirtualKey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Businessoperation extends Main {
	static Scanner sc = new Scanner(System.in);

	public static void operation2() {
		int flag = 0;
		System.out.println("\nEnter the choice: ");
		int arr[] = { 1, 2, 3, 4 };
		int option = sc.nextInt();
		if (option == 1 || option == 2 || option == 3 || option == 4) {
			for (int i = 1; i <= arr.length; i++) {
				if (option == i) {
					switch (option) {
					case 1:
						System.out.println("Enter the file name to be add : ");
						String s = sc.next();
						files.add(s);
						System.out.println("\nFiles is updated....");
						operation();
						break;
					case 2:
						System.out.println("\nEnter the file to be deleted");
						String d = sc.next();
						if (files.contains(d)) {
							files.remove(d);
							System.out.println("\nYour file is successfully deleted");
						} else {
							System.out.println("\nFile not found");
						}
						System.out.println("\nIf you want to see the updated files press 5\n");
						System.out.println("To return back menu press any number\n");
						int n = sc.nextInt();
						if (n == 5) {
							System.out.println("\n" + files);
						}
						operation();
						break;
					case 3:
						System.out.println("\nEnter the file to be find");
						String search = sc.next();
						for (String search1 : files) {
							if (search1.contains(search)) {
								flag = 1;
								break;
							}
						}
						if (flag == 1) {
							System.out.println("\nFile is found\n");
						} else {
							System.out.println("\nFile is not found\n");
						}
						operation();
						break;
					case 4:
						System.out.println();
						selectoption();
						break;
					default:
						System.out.println("\nOops.. enter the correct value");
					}
				}
			}
		} else {
			System.out.println("\nEnter the correct option\n");
			operation();
		}
	}
}
