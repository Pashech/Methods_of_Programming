package by.epam.glava01.main;

//������ � ������� n ����� �����. �� ������� ������� �����, ������� ������� �� 3 ��� �� 9.

public class Task_03 {
	
	

	public static void main(String[] args) {
		
		int[] mass = Input.enterArray();
		
		System.out.println("����� ������� ������� �� 3 ��� �� 9: ");
		
		for(int i = 0; i < mass.length; i++) {
			if((mass[i] % 3 == 0) || (mass[i] % 9 == 0)) {
				System.out.print(mass[i] + " ");
			}
		}
		

	}
	
	

}
