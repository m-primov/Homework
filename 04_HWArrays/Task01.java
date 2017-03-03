/*
Задача 1:
Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.

Пример:
7
10, 3, 5, 8, 6, -3, 7

7
10 -9 5 8 -12 -3 7
-12
Най-малкото число кратно на 3 е -3
*/
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на масива:");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Грешни входни данни. Опитайте отново:");
			n = sc.nextInt();
		}
		
		int[] numbers = new int[n];
		int minNumber = -1;
		
		System.out.println("Въведете " + n + " стойности за елементите на масива:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				if (numbers[i] < minNumber) {
					minNumber = numbers[i];
				}
			}
		}
		
		if (minNumber != -1) {
			System.out.println("Най-малкото число кратно на 3 е: " + minNumber);
		} else {
			System.out.println("В масива няма число, което е кратно на 3");
		}
		
	}

}
