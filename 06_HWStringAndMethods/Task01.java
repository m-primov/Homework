/*
Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.

Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
*/

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string:");
		String firstWord = sc.next();
		System.out.println("Enter a second string:");
		String secondWord = sc.next();
		
		System.out.println(firstWord.toUpperCase() + " " + firstWord.toLowerCase() + 
				" " + secondWord.toUpperCase() + " " + secondWord.toLowerCase());
	}

}
