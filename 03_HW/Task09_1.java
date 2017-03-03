/*
Обръщане на масив без да се използвате друг масив.
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
		for (int i = 0; i < originalArr.length / 2; i++) {
			originalArr[i] = sc.nextInt();
			originalArr[originalArr.length - i - 1] = originalArr[i];
		}
		
		for (int j = 0; j < originalArr.length; j++) {
			System.out.print(originalArr[j] + " ");
		}
	}

}
