/*
Задача 3:
Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива,
както и средноаритметичното на тези числа.
*/
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за броя на редовете:");
		int n = sc.nextInt();
		System.out.println("Въведете стойност за броя на колоните:");
		int m = sc.nextInt();
		
		int[][] matrix = new int[n][m];
		int countElements = n * m;
		double sumElements = 0;
		double averageSumElements = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Въведете стойност за matrix[" + row + "][" + col + "]:");
				matrix[row][col] = sc.nextInt();
				sumElements += matrix[row][col];
			}
		}
		
		averageSumElements = sumElements / countElements;
		System.out.println("Сумата на елементите на масива е " + sumElements);
		System.out.println("Средноаритметичното на числата на масива е " + averageSumElements);
		
	}

}
