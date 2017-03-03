/*
Задача 7:
Имате предварително въведени стойности от естествени числа,
въведени в квадратна таблица с размери 6 реда и 6 колони.
Да се състави програма , чрез която се намира сумата на всички
елементи, чиято сума на индекси за ред и колона е четно число.
Програмата да извежда формираните суми за всеки отделен ред на
квадратната таблица, както и общата сума от тези елементи.
Да се използва само един цикъл.

Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66

Изход:
11, ,13, ,15, , сума от елементите за реда: 39
22, ,24, ,26, сума от елементите за реда: 72
31, ,33, ,35, , сума от елементите за реда: 99
42, ,44, ,46, сума от елементите за реда: 132
51, ,53, ,55, , сума от елементите за реда: 159
62, ,64, ,66 сума от елементите за реда: 192
Сума на елементите: 693
*/
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за броя на редовете и колоните на матрицата:");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		int elementsEvenIndexSum = 0;
		int allRowsSum = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Въведете стойност за matrix[" + row + "][" + col + "]:");
				matrix[row][col] = sc.nextInt();
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			elementsEvenIndexSum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if ((row + col) % 2 == 0) {
					elementsEvenIndexSum += matrix[row][col];
					if (row == matrix.length - 1) {
						System.out.print(matrix[row][col] + " ");
					} else {
						System.out.print(matrix[row][col] + ", ");
					}
				}
			}
			allRowsSum += elementsEvenIndexSum;
			System.out.println("сума от елементите за реда: " + elementsEvenIndexSum);
		}
		
		System.out.println("Сума на елементите: " + allRowsSum);
	}

}
