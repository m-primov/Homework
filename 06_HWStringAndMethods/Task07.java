/*
Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
*/

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words seperated with interval:");
		String line = sc.nextLine();
		
		String[] words = line.split(" ");
		
		int bestLength = words[0].length();
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > bestLength) {
				bestLength = words[i].length();
			}
		}
		
		System.out.println(words.length + " words, the longest is with " + bestLength + " characters");
	}

}
