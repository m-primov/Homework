/*
Задача 12:
Да се създаде метод, който приема за входни данни число N и
връща масив от числа с дължина N, който съдържа всички числа
от 1 до N.
*/
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		printNumbersFromOneToN(n);
	}
	
	static void printNumbersFromOneToN(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == n) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}
