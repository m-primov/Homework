/*
Да се състави програма, която проверява дали въведено естествено
число е просто.
Пример: 101
Изход: просто
*/

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Without recursion !
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		boolean isNumPrime = isPrime(number);
		System.out.println("Is your number prime ? " + isNumPrime);
	}
	
	static boolean isPrime (int num) {
		if (num == 1 || num == 2) {
			return true;
		}
		
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
