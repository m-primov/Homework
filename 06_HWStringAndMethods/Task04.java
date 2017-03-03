/*
Задача 4:
Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
*/
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two names in format [First name Surname Family] divided by comma:");
		String line = sc.nextLine();
		
		int commaPosition = line.indexOf(',');
		System.out.println(commaPosition);
		String firstPersonNames = line.substring(0,  commaPosition);
		String secondPersonNames = line.substring(commaPosition + 2);
		System.out.println(secondPersonNames);
		
		int firstNameLettersSum = returnSumLetters(firstPersonNames);
		int secondNumLettersSum = returnSumLetters(secondPersonNames);
		
		if (firstNameLettersSum > secondNumLettersSum) {
			System.out.println(firstPersonNames);
		} else {
			System.out.println(secondPersonNames);
		}
		
	}
	
	static int returnSumLetters (String name) {
		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				continue;
			}
			sum += name.charAt(i);
		}
		
		return sum;
	}

}
