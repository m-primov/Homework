/*
Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]
*/
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на масива:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int count = 0;
		
		System.out.println("Въведете " + n + " стойности за елементите на масива:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == arr[arr.length - i - 1]) {
				count++;
			}
		}
		
		System.out.println("Огледален ли е масива:");
		if (count == arr.length / 2) {
			System.out.println("Да");
		} else {
			System.out.println("Не");
		}	
	}

}
