package by.epam.glava01.main;

//Ввести с консоли n целых чисел. На консоль вывести четные и нечетные числа.

import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {
		
		int[] mass = enterArray();
		
		System.out.println("Вы ввели: ");
		
		for(int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		
		System.out.println();
		System.out.println("Четные числа: ");
		evenNumber(mass);
		

	}
	
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
	
	
	public static int[] evenNumber(int[] mass) {
		
		for(int i = 0; i < mass.length; i++) {
			if(mass[i] % 2 == 0) {
				System.out.print(mass[i] + " ");
			}
		}
		
		return mass;
	}

}
