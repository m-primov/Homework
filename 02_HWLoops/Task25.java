/*
Задача 25:
Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while.
*/

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за N:");
		int n = sc.nextInt();
		
		int number = 1;
		int sumOfProduct = 0;
		int product = 1;
		
		do {
			product *= number;
			number++;
		} while (number <= n);
		
		System.out.println(n + "! е : " + product);
	}

}
