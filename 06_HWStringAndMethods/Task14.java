/*
Задача 14:
Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).
*/
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		long nFactorial = calculatedNFactorial(n);
		System.out.println(n + "! is " + nFactorial);
	}
	
	static long calculatedNFactorial(int number) {
		long product = 1;
		for (int i = 1; i <= number; i++) {
			product *= i;
		}
		return product;
	}
}
