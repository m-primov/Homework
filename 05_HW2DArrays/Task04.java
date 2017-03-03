/*
Задача 4:
Имате предварително въведени стойности на елементи в двумерен
масив - естествени числа.
Да се състави програма, чрез която се извеждат стойностите на
елементите в двумерен масив след обръщането му на +90 градуса.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4
*/
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for the numbers of rows:");
		int n = sc.nextInt();
		System.out.println("Enter a value for the number of columns:");
		int m = sc.nextInt();
		
		int[][] array2d = new int[n][m];
		
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				System.out.println("Enter a value for array2d[" + row + "][" + col + "]:");
				array2d[row][col] = sc.nextInt();
			}
		}
		
		int[][] array2dRotated = new int[m][n];
		
		System.out.println("The rotated 2d array is:");
		for (int row = 0; row < array2dRotated.length; row++) {
			for (int col = 0; col < array2dRotated[row].length; col++) {
				array2dRotated[row][col] = array2d[array2dRotated[row].length - col - 1][row];
				System.out.print(array2dRotated[row][col] + " ");
			}
			System.out.println();
		}
	}

}
