/*
	Задача 13: Да се състави програма, която извежда всички
	естествени трицифрени числа, които имат сбор на цифрите равен
	на дадено число.
*/
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за сумата от 2 до 27:");
		int inputSum = sc.nextInt();
		int digitsSum = 0;
		
		if (inputSum >= 2 && inputSum <= 27) {
			for (int i = 100; i <= 999; i++) {
				int number = i;
				while (number > 0) {
					int nextDigit = number % 10;
					digitsSum += nextDigit;
					number /= 10;
				}
				
				if (digitsSum == inputSum) {
					System.out.print(i + " ");
				}
				digitsSum = 0;
			}
		} else {
			System.out.println("Невалидни входни данни.");
		}
	}

}
