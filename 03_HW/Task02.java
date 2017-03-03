/*
Задача 2:
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана.
*/
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на масива:");
		int n = sc.nextInt();
		
		int[] originalArr = new int[n];
		int[] arr = new int[originalArr.length];
		
		System.out.println("Въведете " + n + " стойности за елементите на масива:");
		for (int i = 0; i < originalArr.length; i++) {
			originalArr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < originalArr.length; i++) {
			if (i < originalArr.length / 2) {
				arr[i] = originalArr[i];
			} else {
				arr[i] = originalArr[originalArr.length - i + 2];
			}
		}
		
		System.out.println("Новия масив:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
