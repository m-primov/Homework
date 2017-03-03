/*
Задача 8:
Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число.
*/
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 4-цифрено число в интервала [10..9999]:");
		int number = sc.nextInt();
		
		int fourthDigit = number % 10;
//		System.out.println(fourthDigit);
		int thirdDigit = (number / 10) % 10;
//		System.out.println(thirdDigit);
		int secondDigit = (number / 100) % 10;
//		System.out.println(secondDigit);
		int firstDigit = number / 1000;
//		System.out.println(firstDigit);
		
		int firstNumber = Integer.parseInt(Integer.toString(firstDigit) + Integer.toString(fourthDigit));
		int secondNumber = Integer.parseInt(Integer.toString(secondDigit) + Integer.toString(thirdDigit));
		
		if (firstNumber < secondNumber) {
			System.out.printf("по-малко (%d < %d)", firstNumber, secondNumber);
		} else if (firstNumber > secondNumber) {
			System.out.printf("по-голямо (%d > %d)", firstNumber, secondNumber);
		} else {
			System.out.printf("равни (%d = %d)", firstNumber, secondNumber);
		}
	}

}
