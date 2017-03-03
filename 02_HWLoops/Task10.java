/*
Задача 10: Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
*/

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число:");
		int number = sc.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Числото е просто");
		} else {
			System.out.println("Числото не е просто");
		}
	}

}
