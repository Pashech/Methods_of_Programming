package by.epam.glava01.main;

//Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 5 и на 7.

public class Task_04 {

	public static void main(String[] args) {
		
		int[] mass = Input.enterArray();
		
		System.out.println("Числа которые делятся на 5 и на 7: ");
		
		for(int i = 0; i < mass.length; i++) {
			if((mass[i] % 5 == 0) && (mass[i] % 7 == 0)) {
				System.out.print(mass[i] + " ");
			}
		}

	}

}
