/*
Задача 6:
Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.

Пример: супер яката задача
Изход: Супер Яката Задача
*/
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String line = sc.nextLine();
		String[] words = line.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			String firstLetter = words[i].substring(0, 1);
			String wordRemain = words[i].substring(1);
			firstLetter = firstLetter.toUpperCase();
			String word = firstLetter + wordRemain;
			System.out.print(word + " ");
		}
	}

}
