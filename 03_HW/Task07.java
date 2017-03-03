/*
Задача 7:
Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
*/
import java.util.Scanner;

public class Task07 {

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
		arr[0] = originalArr[0];
		arr[arr.length - 1] = originalArr[originalArr.length - 1];
		
		for (int i = 1; i < arr.length - 1; i++) {
			arr[i] = originalArr[i - 1] + originalArr[i + 1];
		}
		
		System.out.println("Новополучения масив е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
