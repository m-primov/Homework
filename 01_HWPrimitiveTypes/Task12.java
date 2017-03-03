/*
Задача 12:
Високосни години са всички години кратни на 4 с изключения
столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
но 1600 и 2000 са високосни.
Съставете програма, която по дадени ден, месец, година отпечатва
следващата дата.
Входни данни: три числа за ден, месец, година.
Пример: 28, 2, 2000
Изход: 1,3,2000
*/
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден:");
		int day = sc.nextInt();
		System.out.println("Въведете месец:");
		int month = sc.nextInt();
		System.out.println("Въведете година:");
		int year = sc.nextInt();
		
		boolean isLeapYear = false;
		
		if ((year % 4 == 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (day == 31) {
				month++;
				day = 1;
			} else {
				day++;
			}
			break;
		case 12:
			if (day == 31) {
				day = 1;
				month = 1;
				year++;				
			} else {
				day++;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day == 30) {
				day = 1;
				month++;
			} else {
				day++;
			}
			break;
		case 2: 
			if (isLeapYear) {
				if (day == 29) {
					day = 1;
					month++;
				} else {
					day++;
				}
			} else {
				if (day == 28) {
				day = 1;
				month++;
				} else {
					day++;
				}
			}
			break;
		}
			
		System.out.printf("%d, %d, %d", day, month, year);
	}
}
