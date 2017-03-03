/*
Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
*/

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете естествено число N от интервала [10..200]:");
		int inputNum = sc.nextInt();
		
		if (inputNum >= 10 && inputNum <= 200) {
			for (int numMultiplesSeven = 200; numMultiplesSeven >= 10; numMultiplesSeven--) {
				if (numMultiplesSeven >= inputNum) {
					continue;
				}
				if (numMultiplesSeven % 7 == 0) {
					System.out.print(numMultiplesSeven + " ");
				}
			}
		} else {
			System.out.println("Невалидни входни данни");
		}
	}

}
