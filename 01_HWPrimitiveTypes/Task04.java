/*
Задача 4:
Въведете 2 различни числа от конзолата и ги разпечатайте в
нарастващ ред.
*/

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число:");
		int firstNum = sc.nextInt();
		System.out.println("Въведете второ число:");
		int secondNum = sc.nextInt();
		
		if (firstNum < secondNum) {
			System.out.printf(firstNum + " " + secondNum);
		} else {
			System.out.printf(secondNum + " " + firstNum);
		}
	}

}
