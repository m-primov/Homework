/*
Задача 8:
Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
Вход: капак
Изход: да.
Вход: тенджера
Изход: не.
*/
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String word = sc.next();
		
		boolean isPalindrom = true;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				isPalindrom = false;
				break;
			}
		}
		
		if (isPalindrom) {
			System.out.println("The word is palindrom");
		} else {
			System.out.println("The word is not palindrom");
		}
	}

}
