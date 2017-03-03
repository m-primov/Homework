/*
Да се състави програма, чрез която по въведени начална и крайна
цифра се извеждат на всеки нов ред следната последователност
(триъгълник от знаци):
Пример: 1, 9
Изход:
11
2
1 2 3
... до
1 2 3 4 5 6 7 8 9
Използвайте рекурсия
*/

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number:");
		int startNum = sc.nextInt();
		System.out.println("Enter end number:");
		int endNum = sc.nextInt();
		
		printTriangle(startNum, endNum);
	}
	
	static void printTriangle(int start, int end) {
		if (end == 0) {
			return;
		}
		
		printTriangle(start, end - 1);
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
