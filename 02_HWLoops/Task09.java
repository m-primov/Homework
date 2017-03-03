/*
Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
*/

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете A:");
		int a = sc.nextInt();
		System.out.println("Въведете B:");
		int b = sc.nextInt();
		
		int sum = 0;
		int min = a;
		int max = b;
		if (max <= min) {
			max = a;
			min = b;
		}
		
		for (int i = min; i < max; i++) {
			if ((i * i) % 3 == 0) {
				System.out.print("skip " + i + ", ");
				continue;
			}
			sum += (i * i);
			if (sum > 200) {
				break;
			}
			System.out.print((i * i) + ", ");
		}
	}

}
