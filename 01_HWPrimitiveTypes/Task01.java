/*
Задача 1:
Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double).
После да се прочете 3-то число C и да се провери дали то е м/у A и B.
Да се изведе подходящо съобщение за това дали C е между A и B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.ROOT);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете A: ");
		double firstNum = sc.nextDouble();
		System.out.println("Въведете B: ");
		double secondNum = sc.nextDouble();
		System.out.println("Въведете C: ");
		double thirdNum = sc.nextDouble();
		
//		if ((firstNum < thirdNum) && (thirdNum < secondNum)) {
//			System.out.printf("Числото %.1f е между %.1f и %.1f", 
//				thirdNum, firstNum, secondNum);
//		} else {
//			System.out.printf("Числото %.1f не е между %.1f и %.1f", 
//				thirdNum, firstNum, secondNum);
//		}
		
		if ((firstNum < thirdNum) && (thirdNum < secondNum)) {
			System.out.format("Числото %.2f е между %.2f и %.2f", 
					thirdNum, firstNum, secondNum);
		} else {
			System.out.format("Числото %f не е между %f и %f", 
					thirdNum, firstNum, secondNum);
		}
	}

}
