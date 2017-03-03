/*
Задача 1:
Имате двумерен масив 6х5 от естествени числа, чийто стойности са
въведени предварително.
Да се състави програма, чрез която се извеждат елементите от масива
с най-малката и най-голямата стойност.

Пример:
48,72,13,14,15
21,22,53,24,75
31,57,33,34,35
41,95,43,44,45
59,52,53,54,55
61,69,63,64,65
Изход:
най-малко 13;
най-голямо 95
*/
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за броя на редовете:");
		int row = sc.nextInt();
		System.out.println("Въведете стойност за броя на колоните:");
		int col = sc.nextInt();
		
		int[][] matrix = new int[row][col];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Въведете стойност за matrix[" + i + "][" + j +"]:");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < minValue) {
					minValue = matrix[i][j];
				}
				
				if (matrix[i][j] > maxValue) {
					maxValue = matrix[i][j];
				}
			}
		}
		
		System.out.println("Най-малкото число в двумерния масив е " + minValue);
		System.out.println("Най-голямото число в двумерния масив е " + maxValue);
	}

}
