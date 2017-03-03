/*
Задача 7: Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая.
*/

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = sc.nextInt();
		int numberDivisibleByThree = 3;
		
		while (n > 0) {
//			if (n != 1) {
//				System.out.print(numberDivisibleByThree + ", ");
//			} else {
//				System.out.print(numberDivisibleByThree);
//			}
			
			String output = n != 1?numberDivisibleByThree + ", " : numberDivisibleByThree + "";
			System.out.print(output);
			numberDivisibleByThree += 3;
			n--;
		}
	}

}
