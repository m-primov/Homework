/*
Задача 13:
Да се състави програма, чрез която се въвежда число и се представя
като число в двоична бройна система.
Програмата, чрез масив, да изчислява последователно всички цифри
на въведеното естествено число в 2-ична бройна система.
Пример: 99
Изход: 1100011
*/

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число:");
		int number = sc.nextInt();
		
		int copyNumber = number;
		int arrLength = 0;
		int bit = 0;
		
		while (copyNumber > 0) {
			arrLength++;
			copyNumber /= 2;
		}
		
		int[] binaryRepresentation = new int[arrLength];
		
		for (int i = 0; i < binaryRepresentation.length; i++) {
			bit = number % 2;
			binaryRepresentation[binaryRepresentation.length - i - 1] = bit;
			number /= 2;
		}
		
		System.out.println("Въведеното число има двоичен вид:");
		for (int i = 0; i < binaryRepresentation.length; i++) {
			System.out.print(binaryRepresentation[i]);
		}
	}

}
