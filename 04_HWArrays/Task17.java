/*
Задача 17:
Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
*/
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за дължината на масива:");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		int perform = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Въведете стойност за numbers[" + i + "]:");
			numbers[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numbers.length - 1; i++) {
			if (i % 2 == 0 && numbers[i] < numbers[i + 1]) {
				perform++;
			} else if (i % 2 == 1 && numbers[i] > numbers[i + 1]) {
				perform++;
			}
		}
		
		if (perform == numbers.length - 1 && numbers.length > 2) {
			System.out.println("Редицата е зигзаообразна");
		} else {
			System.out.println("Редицата не е зигзаообразна");
		}
	}

}
