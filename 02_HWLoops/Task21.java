/*
Задача 21:
Дадено е наредено тесте карти.
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от
интервала [1..51] и се извеждат въведения номер карта и
останалите по-големи карти от тестето.
Пример: 47.
Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
пика
*/

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете номер на картата:");
		int n = sc.nextInt();
		
		int card = 0;
		int typeCard = 0;
		
		for (int i = n - 1; i < 52; i++) {
			card = i / 4 + 2;
			typeCard = i % 4;
			
			switch (card) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.print(card);
				break;
			case 11:
				System.out.print("Вале");
				break;
			case 12:
				System.out.print("Дама");
				break;
			case 13:
				System.out.print("Поп");
				break;
			case 14:
				System.out.print("Асо");
				break;
			}
			
			switch (typeCard) {
			case 0:
				System.out.print(" Спатия; ");
				break;
			case 1:
				System.out.print(" Каро; ");
				break;
			case 2:
				System.out.print(" Купа; ");
				break;
			case 3:
				System.out.print(" Пика; ");
				break;
			}
		}
		
	}

}
