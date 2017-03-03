/*
	Задача 6: Да се прочете число от екрана(конзолата) и да се
	изведе сбора на всички числа между 1 и въведеното число.  
 */

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число:");
		int number = sc.nextInt();
		
		int sum = 0;
		
//		for (int i = 1; i <= number; i++) {
//			sum += i;
//		}
		
		while (number > 0) {
			sum += number;
			number--;
		}
		
		System.out.println("Резултата е " + sum);
	}

}
