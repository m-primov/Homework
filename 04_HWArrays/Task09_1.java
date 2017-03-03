/*
Обръщане на масив без да се използвате друг масив.

6 27 -1 5 7 7 5 -1 27 6
*/
import java.util.Scanner;

public class Task09_1 {

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
		
		for (int i = 0; i < originalArr.length / 2; i++) {
			int y = originalArr.length - i - 1;
			int temp = originalArr[y];
			originalArr[y] = originalArr[i];
			originalArr[i] = temp;
		}
		
		for (int j = 0; j < originalArr.length; j++) {
			System.out.print(originalArr[j] + " ");
		}
	}

}
