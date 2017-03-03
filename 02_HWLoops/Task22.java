/*
Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while.
*/
import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число от интервала [1..999]:");
		int number = sc.nextInt();
		
		if (1 <= number && number <= 999) {
			int controlNumber = 1;
			int count = 0;
			number += 1;
			while (number <= 999) {
				if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
					System.out.print(controlNumber + ":" + number + ", ");
					controlNumber++;
					count++;
				}
				
				if (count == 10) {
					break;
				}
				number++;
			}
			System.out.println();
			if (count < 10) {
				System.out.println("Няма 10 числа по-големи от въведенето, които да се делят на 2, 3 или 5");
			}
		} else {
			System.out.println("Невалидни входни данни");
		}
		
	}

}
