/*
Задача 9:
Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.

Вход: asd-12sdf45-56asdf100

Изход:
-12
45
-56
100
Сума = 77
*/
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String line = sc.next();
		
		int dashPosition = line.indexOf('-');
		int sum = 0;
		
		String numAsStr = "";
		int number = 0;
		
		for (int j = 0; j < line.length() - 1; j++) {
			char symbol = line.charAt(j);
			if (symbol == '-') {
				while (isDigit(line.charAt(j + 1)) && j < line.length()) {
					numAsStr += line.charAt(j + 1);
					j++;
				}
				number = 0 - Integer.parseInt(numAsStr);
				sum += number;
				System.out.println(number);
			} else if (isDigit(line.charAt(j))) {
				numAsStr += line.charAt(j);
				while (isDigit(line.charAt(j + 1)) && j < line.length()) {
					numAsStr += line.charAt(j + 1);
					j++;
				}
				sum += number;
				System.out.println(number);
			}
			j += numAsStr.length();
			number = 0;
			numAsStr = "";
		}
	}
	
	static boolean isDigit(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}
}
