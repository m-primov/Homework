/*
Задача 3:
Въведете 2 различни числа от конзолата и разменете стойността им.
Разпечатайте новите стойности
*/
import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число:");
		int firstNum = sc.nextInt();
		System.out.println("Въведете второ число:");
		int secondNum = sc.nextInt();
		
		System.out.printf("Въведохте числата: %d като първо и %d като второ %n", firstNum, secondNum);
		
		int temp = 0;
		temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		
		System.out.printf("След размяната числата имат стойности: %d за първото и %d за второто",
				firstNum, secondNum);
		
	}
}
