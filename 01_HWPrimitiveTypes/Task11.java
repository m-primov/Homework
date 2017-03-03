/*
Задача 11:
Съставете програма, която по дадено трицифренo число проверява
дали числото се дели на всяка своя цифра. Във въведеното число да
няма цифра 0.
*/
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число:");
		int number = sc.nextInt();
		
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number %10;
		boolean isDivideByEveryDigit = false;
		boolean haveZeroAsDigit = true;
		
		if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0) {
			isDivideByEveryDigit = (number % firstDigit == 0) && (number % secondDigit == 0) && 
					(number % thirdDigit == 0);
			haveZeroAsDigit = false;
		}
		
		if (haveZeroAsDigit) {
			System.out.println("Въвели сте неправилно число ! Не трябва да съдържа цифрата 0 !");
		} else {
			System.out.println("Числото дели ли се на всяка своя цифра ? " + isDivideByEveryDigit);
		}
	}

}
