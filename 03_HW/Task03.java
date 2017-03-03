/*
Задача 3:
Да се въведе число, след което да се създаде масив с 10
елемента по следния начин:
Първите 2 елемента на масива са въведеното число.
Всеки следващ елемент на масива е равен на сбора от
предишните 2 елемента в масива.
След това изведете масива .
*/

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int[] arr = new int[10];
		
		arr[0] = number;
		arr[1] = number;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		System.out.println("Новият масив е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
