/*
Задача 24:
Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.
*/
import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойнст за N от интервала [10 .. 30000]:");
		int n = sc.nextInt();
		
		int originalNumber = n;
		int reversedNumber = 0;
		
//		int numberOfDigits = 0;
//		while (n > 0) {
//			n /= 10;
//			numberOfDigits++;
//		}
		
		do {
			reversedNumber *= 10;
			reversedNumber += n % 10;
			n /= 10;
		} while(n > 0);
		
		if (reversedNumber == originalNumber) {
			System.out.println("Числото е палиндром");
		} else {
			System.out.println("Числото не е палиндром");
		}
	}

}
