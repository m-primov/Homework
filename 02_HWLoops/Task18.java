/*
Задача 18:
Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.
Пример: 2 2
Изход:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4;
*/

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число в интервала [1..9]:");
		int firstNum = sc.nextInt();
		System.out.println("Въведете число в интервала [1..9]:");
		int secondNum = sc.nextInt();
		if ((1 <= firstNum && firstNum <= 9) && (1 <= secondNum && secondNum <= 9)) {
			int maxNumber = (firstNum >= secondNum) ? firstNum : secondNum;
			int minNumber = (firstNum < secondNum) ? firstNum : secondNum;
			
			int product = 1;
			
			for (int i = 1; i <= minNumber; i++) {
				for (int j = 1; j <= maxNumber; j++) {
					product *= i * j;
					System.out.println(i + "*" + j + " = " + product + ";");
					product = 1;
				}
			}
		} else {
			System.out.println("Невалидни входни данни");
		}
		
	}

}
