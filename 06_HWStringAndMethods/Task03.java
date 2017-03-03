/*
Задача 3:
Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
*/
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter a first word:");
		String firstWord = sc.nextLine();
		System.out.println("Enter a second word");
		String secondWord = sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		if (firstWord.length() == secondWord.length()) {
			result.append("The two strings are with same length" + "\n" + "Difference by position:" + "\n");
			for (int i = 0; i < firstWord.length(); i++) {
				if (firstWord.charAt(i) != secondWord.charAt(i)) {
					result.append("" + (i + 1) + " " + firstWord.charAt(i) + "-" + secondWord.charAt(i) + "\n");
				}
			}
		} else {
			result.append("The strings are with different length");
		}
		
		System.out.println(result);
	}

}
