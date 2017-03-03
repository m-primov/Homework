/*
Задача 2:
Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe
*/

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter a two words with length between 10 and 20 signs:");
		String line = sc.nextLine();
		
		String[] words = line.split(" ");
		String firstWord = words[0];
		String secondWord = words[1];
		/*if ((firstWord.length() < 10 || firstWord.length() > 20) 
				|| (secondWord.length() < 10 || secondWord.length()> 20)) {
			System.out.println("Invalid input. The word must have length between 10 and 20 signs.");
		} else {
			
		}*/
		
		String biggerWord = firstWord.length() >= secondWord.length() ? firstWord : secondWord;
		String smallerWord = firstWord.length() < secondWord.length() ? firstWord : secondWord;
		
		String firstFiveSigns = smallerWord.substring(0, 5);
		String remainString = biggerWord.substring(5);
		
		String newWord = firstFiveSigns.concat(remainString);
		
		System.out.println(newWord.length() + " " + newWord);
	}

}
