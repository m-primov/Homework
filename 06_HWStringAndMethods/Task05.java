/*
Задача 5:
Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :

шапка
машина

	м
	а
	шапка
	и
	н
	а
*/
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first word:");
		String firstWord = sc.nextLine();
		System.out.println("Enter a second word");
		String secondWord = sc.nextLine();
		int position = -1;
		
		for (int i = 0; i < firstWord.length(); i++) {
			char letter = firstWord.charAt(i);
			for (int j = 0; j < secondWord.length(); j++) {
				if (secondWord.charAt(j) == letter) {
					position = j;
					break;
				}
			}
			if (position != -1) {
				break;
			}
		}
		
		if (position == -1) {
			System.out.println("The two strings does not have same letters");
		} else {
			for (int i = 0; i < secondWord.length(); i++) {
				if (i == position) {
					System.out.println(firstWord);
					//continue;
				} else {
					System.out.println(secondWord.charAt(i));
				}
			}
		}
		
	}
}
