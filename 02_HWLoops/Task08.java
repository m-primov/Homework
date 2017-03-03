/*
	Задача 8: По зададено число n, да се изведе на екрана таблица по
	следния начин:
Пример:
Въведете n:		Въведете n:		Въведете n: 	Въведете n:
1				2				3				4
0				11				222				3333
				33				444				5555
								666				7777
												9999
*/

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = sc.nextInt();
		int startNumber = n - 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(startNumber);
			}
			startNumber += 2;
			System.out.println();
		}
	}

}
