/*
Задача 2:
Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
разлика, произведение, остатък от деление и целочислено деление в
отделни променливи и разпечатайте тези резултати в конзолата.
Опитайте същото с числа с плаваща запетая.
*/

import java.util.Locale;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.ROOT);
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо целочислено число:");
		long firstIntNum = sc.nextLong();
		System.out.println("Въведете второ целочислено число:");
		long secondIntNum = sc.nextLong();
		
		long difference = firstIntNum - secondIntNum;
		long sum = firstIntNum + secondIntNum;
		long multiply = firstIntNum * secondIntNum;
		long division = firstIntNum / secondIntNum;
		long integerDivision = firstIntNum % secondIntNum;
		
		System.out.println("The difference of the two integer numbers is: " + difference);
		System.out.println("The sum of the two integer numbers is: " + sum);
		System.out.println("The multiply of the two integer numbers is: " + multiply);
		System.out.println("The division of the two integer numbers is: " + division);
		System.out.println("The integer-division of the two integer numbers is: " + integerDivision);
		
		System.out.println("Въведете първо число с плаваща запетая:");
		double firstFloatingPointNum = sc.nextDouble();
		System.out.println("Въведете второ число с плаваща запетая:");
		double secondFloatingPointNum = sc.nextDouble();
		
		double differenceSecondNums = firstFloatingPointNum - secondFloatingPointNum;
		double sumSecondNums = firstFloatingPointNum + secondFloatingPointNum;
		double multiplySecondNums = firstFloatingPointNum * secondFloatingPointNum;
		double divisionSecondNums = firstFloatingPointNum / secondFloatingPointNum;
		double integerDivisionSecondNums = firstFloatingPointNum % secondFloatingPointNum;
		
		System.out.println("The difference of the two floating-point numbers is: " + difference);
		System.out.println("The sum of the two floating-point numbers is: " + sum);
		System.out.println("The multiply of the two floating-point numbers is: " + multiply);
		System.out.println("The division of the two floating-point numbers is: " + division);
		System.out.println("The integer-division of the two floating-point numbers is: " + integerDivision);
	}

}
