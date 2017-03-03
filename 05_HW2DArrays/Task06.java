/*
Задача 6:
Имате предварително въведени стойности от естествени числа.
Числата са въведени в квадратна таблица с размери 6 реда и 6
колони.
Да се състави програма, чрез която се намира сумата на всички
елементи от редовете с четни номера: 2,4 и 6.
Програмата да извежда и сумата на всеки отделен ред.

Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
*/
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете стойност за броя на редовете и колоните на матрицата:");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		int sumEvenRow = 0;
		int sumAllEvenRows = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Въведете стойност за matrix[" + row + "][" + col + "]:");
				matrix[row][col] = sc.nextInt();
			}
		}
		
		for (int row = 0; row < matrix.length; row += 2) {
			sumEvenRow = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				sumEvenRow += matrix[row][col];
				if (col == matrix[row].length - 1) {
					System.out.print(matrix[row][col]);
				} else {
					System.out.print(matrix[row][col] + ",");
				}
			}
			sumAllEvenRows += sumEvenRow;
			System.out.println(" сума " + sumEvenRow);
		}
		
		System.out.println("Сума на елементите " + sumAllEvenRows);
	}

}
