package by.epam.glava01.main;

import java.util.Scanner;

public class Input {
	
	public static int[] enterArray() {

		System.out.println("Enter the number of numbers: ");
		int size;

		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		int[] mass = new int[size];

		System.out.println("Enter numbers: ");

		for (int i = 0; i < mass.length; i++) {
			mass[i] = sc.nextInt();

		}

		return mass;
	}

}
