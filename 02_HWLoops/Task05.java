/*
 	Задача 5: Да се въведат от потребителя 2 числа. И да се
	изведат на екрана всички числа от по-малкото до по-голямото.
*/

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число:");
		int firstNum = sc.nextInt();
		System.out.println("Въведете второ число:");
		int secondNum = sc.nextInt();
		
		/*if (firstNum < secondNum) {
			for (int i = firstNum; i <= secondNum; i++) {
				System.out.print(i + " ");
			}
		} else if (secondNum < firstNum) {
			for (int i = secondNum; i <= firstNum; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(firstNum);
		}*/
		
		int max = firstNum;
		int min = secondNum;
		if (secondNum > max) {
			max = secondNum;
			min = firstNum;
		}
		
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}

}
