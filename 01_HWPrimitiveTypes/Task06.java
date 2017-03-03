/*
Задача 6:
Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
а3 да има старата стойност на а1.
*/
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за а1:");
		int a1 = sc.nextInt();
		System.out.println("Въведете стойност за а2:");
		int a2 = sc.nextInt();
		System.out.println("Въведете стойност за а3:");
		int a3 = sc.nextInt();
		System.out.printf("Въведени числа: %d %d %d %n", a1, a2, a3);
		int temp = 0;
		
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.printf("След размяната: %d %d %d", a1, a2, a3);
	}

}
