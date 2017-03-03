/*
	Задача 16:
Да се състави програма, чрез която предварително въведени 10
реални числа от интервала се обработват по следния начин:
1. Извежда съществуващите числа.
2. Всички елементи със стойност по-малки от -0.231 се заменят със
сумата от квадрата на поредния им номер + числото 41.25, а всички
останали елементи се заменят с произведението между самия елемент
и неговият пореден номер. Поредният номер на първият елемент е 1.
3. Да се изведат елементите от началния и новообразувания масив.

Пример: -1,12 -2,43 3,1 4,2 0 6,4 -7,5 8,6 9,1 -4
Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
*/
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за дължината на масива:");
		int n = sc.nextInt();
		
		double[] originalArr = new double[n];
		double[] arr = new double[originalArr.length];
		double constNum = 41.25;
		double border = -0.231;
		
		for (int i = 0; i < originalArr.length; i++) {
			//System.out.println("Въведете стойност за елемент[" + i + "]");
			originalArr[i] = sc.nextDouble();
		}
		
		System.out.println("Въведения масив е:");
		for (int i = 0; i < originalArr.length; i++) {
			System.out.print(originalArr[i] + " ");
		}
		
		for (int i = 0; i < originalArr.length; i++) {
			if (originalArr[i] < border) {
				arr[i] = (i + 1) * (i + 1) + constNum;
			} else {
				arr[i] = originalArr[i] * (i + 1);
			}
		}
		
		System.out.println("Новополучения масив е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
