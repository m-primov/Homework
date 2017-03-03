/*
Задача 16:
Въведено е трицифрено естествено число от вида abc.
Трябва да се провери дали:
ако a = b = c - Изход: цифрите са равни;
ако a>b>c - Изход: цифрите са във възходящ ред;
ако a<b<c цифрите са в низходящ ред;
и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
Пример: 345
Изход: възходящ ред.
*/
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено естествено число:");
		int number = sc.nextInt();
		
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;
		
		if (firstDigit == secondDigit && secondDigit == thirdDigit) {
			System.out.println("цифрите са равни");
		} else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
			System.out.println("цифрите са в низходящ ред");
		} else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
			System.out.println("цифрите са във възходящ ред");
		} else {
			System.out.println("цифрите са ненаредени");
		}
	}

}
