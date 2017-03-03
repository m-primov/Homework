/*
Задача 19: Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1
*/
import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете естествено число от интервала [10..99]:");
		int inputNumber = sc.nextInt();
		
		int number = 0;
		
		if (10 <= inputNumber && inputNumber <= 99) {
			do {
				if (inputNumber % 2 == 0) {
					inputNumber = inputNumber / 2;
					System.out.print(inputNumber + " ");
				} else {
					inputNumber = inputNumber * 3 + 1;
					System.out.print(inputNumber + " ");
				}
				number = inputNumber;
			} while (number != 1);
		} else {
			System.out.println("Невалидни входни данни");
		}
		
	}

}
