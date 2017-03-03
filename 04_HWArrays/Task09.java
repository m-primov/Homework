/*
Задача 9:
Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
*/

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на масива:");
		int n = sc.nextInt();
		
		int[] originalArr = new int[n];
		
		System.out.println("Въведете " + n + " стойности за елементите на масива:");
		for (int i = 0; i < originalArr.length; i++) {
			originalArr[i] = sc.nextInt();
		}
		
		int[] arr = new int[originalArr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = originalArr[arr.length - i - 1];
		}
		
		System.out.println("Обърнатия масив е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
