package by.epam.glava01.main;

//¬вести с консоли n целых чисел. Ќа консоль вывести наибольшее и наименьшее число.

public class Task_02 {

	public static void main(String[] args) {
		
		int[] mass = Input.enterArray();
		
		maxMinNumber(mass);

	}
	
	public static void maxMinNumber(int[] mass) {
		int min = mass[0];
		int max = mass[0];
		
		for(int i = 0; i < mass.length; i++) {
			
			if(mass[i] < min) {
				min = mass[i];
			}
			
			if(mass[i] > max ) {
				max = mass[i];
			}
		}
		
		System.out.println("Min number is: " + min);
		System.out.println("Max number is: " + max);
		
	}

}
