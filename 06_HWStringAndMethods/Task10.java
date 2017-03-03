/*
Задача 10:
Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt
*/
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = sc.next();
		
		for (int i = 0; i < word.length(); i++) {
			char letter = (char)(word.charAt(i) + 5);
			System.out.print(letter);
		}
	}

}
