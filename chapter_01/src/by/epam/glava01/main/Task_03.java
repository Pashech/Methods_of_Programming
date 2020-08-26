package by.epam.glava01.main;

//Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 3 или на 9.

public class Task_03 {
	
	

	public static void main(String[] args) {
		
		int[] mass = Input.enterArray();
		
		System.out.println("Числа которые делятся на 3 или на 9: ");
		
		for(int i = 0; i < mass.length; i++) {
			if((mass[i] % 3 == 0) || (mass[i] % 9 == 0)) {
				System.out.print(mass[i] + " ");
			}
		}
		

	}
	
	

}
