/*
Задача 2:
Имате квадратен двумерен масив от естествени числа, чийто стойности
се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
Пример:
1,4,6,3
5,9,7,2
4,8,1,9
2,3,4,5
Изход:
1 9 1 5
3 7 8 2
*/

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за редовете и колоните:");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Въведете стойност за matrix[" + row + "][" + col + "]:");
				matrix[row][col] = sc.nextInt();
			}
		}
		
		// print the main diagonal
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (row == col) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		System.out.println();
		// print the second diagonal
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if ((row + col) == matrix.length - 1) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
	}

}
