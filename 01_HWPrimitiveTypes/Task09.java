/*
Задача 9:
Да се състави програма, която чете от конзолата 2 естествени
двуцифрени числа a,b.
Програмата да изведе в конзолата дали последната цифра от
произведението на двете числа е четна, както и самата цифра.
Входни данни: a,b - естествени числа от интервала [10..99].
Пример: 15, 25
Изход: 375, 5 нечетна
*/
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо естествено число от интервала [10..99]:");
		int firstNum = sc.nextInt();
		System.out.println("Въведете второ естествено числоот интервала [10..99]:");
		int secondNum = sc.nextInt();
		
		int productResult = firstNum * secondNum;
		int lastDigit = productResult % 10;
		
		boolean isEven = (productResult % 2 == 0);
		boolean isEvenLastDigit = (lastDigit % 2 == 0);
		
		System.out.printf(isEven ? "Произведението е четно" : "Произведението е нечетно");
		System.out.println();
		System.out.printf(isEvenLastDigit ? "Последната цифра е четна" : "Последната цифра е нечетна");
	}

}
