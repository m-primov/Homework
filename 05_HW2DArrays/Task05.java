/*
Задача 5:
Да се състави програма, при която предварително са въведени
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.

Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16

Изход:
най-голяма сума по редове 58
най-голяма сума по колони 40
Максималната сума по редове е > от максималната сума по колони
*/
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за броя на редовете и колоните на матрицата:");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		int sumRows = 0;
		int bestSumRows = 0;
		int sumCols = 0;
		int bestSumCols = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Въведете стойност за matrix[" + row + "][" + col + "]:");
				matrix[row][col] = sc.nextInt();
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			sumRows = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				sumRows += matrix[row][col];
			}
			if (sumRows > bestSumRows) {
				bestSumRows = sumRows;
			}
		}
		
		for (int col = 0; col < matrix.length; col++) {
			sumCols = 0;
			for (int row = 0; row < matrix[col].length; row++) {
				sumCols += matrix[row][col];
			}
			if (sumCols > bestSumCols) {
				bestSumCols = sumCols;
			}
		}
		
		System.out.println("Най-голяма сума по редове е " + bestSumRows);
		System.out.println("Най-голяма сума по колони е " + bestSumCols);
		
		if (bestSumRows > bestSumCols) {
			System.out.println("Максималната сума по редове е > от максималната сума по колони");
		} else {
			System.out.println("Максималната сума по редове е < от максималната сума по колони");
		}
	}

}
