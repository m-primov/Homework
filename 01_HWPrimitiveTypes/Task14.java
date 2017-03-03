/*
Задача 14:
Да се състави програма, която по въведени координати на 2 позиции
от шахматната дъска извежда отговор дали са оцветени в еднакъв или
различен цвят.
Шахматната дъска е квадратна.
Въвеждат се две двойки числа от интервала [1..8].
Пример: 2 2 3 2
Изход: Позициите са с различен цвят
*/
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете две числа в интервала [1..8] за координатите на първата точка:");
		int rowFirstPoint = sc.nextInt();
		int columnFirstPoint = sc.nextInt();
		System.out.println("Въведете две числа в интервала [1..8] за координатите на втората точка:");
		int rowSecondPoint = sc.nextInt();
		int columnSecondPoint = sc.nextInt();
		
//		if (rowFirstPoint % 2 == 1 && rowSecondPoint % 2 == 1) {
//			if (columnFirstPoint % 2 == 1 && columnSecondPoint % 2 == 1) {
//				System.out.println("Позициите са с еднакъв цвят");
//			} else {
//				System.out.println("Позициите са с различен цвят");
//			}
//		} else if (rowFirstPoint % 2 == 0 && rowSecondPoint % 2 == 0) {
//			if (columnFirstPoint % 2 == 0 && columnSecondPoint % 2 == 0) {
//				System.out.println("Позициите са с еднакъв цвят");
//			} else {
//				System.out.println("Позициите са с различен цвят");
//			}
//		} else if (rowFirstPoint % 2 == 1 && rowSecondPoint % 2 == 0) {
//			if (columnFirstPoint % 2 == 1 && columnSecondPoint % 2 == 0) {
//				System.out.println("Позициите са с еднакъв цвят");
//			} else {
//				System.out.println("Позициите са с различен цвят");
//			}
//		} else if (rowFirstPoint % 2 == 0 && rowSecondPoint % 2 == 1) {
//			if (columnFirstPoint % 2 == 0 && columnSecondPoint % 2 == 1) {
//				System.out.println("Позициите са с еднакъв цвят");
//			} else {
//				System.out.println("Позициите са с различен цвят");
//			}
//		}

		// Optimization
		int coordinatesFirstPoint = rowFirstPoint + columnFirstPoint;
		int coordinatesSecondPoint = rowSecondPoint + columnSecondPoint;
		if ((coordinatesFirstPoint % 2 == 0) && (coordinatesSecondPoint % 2 == 0)) {
			System.out.println("Позициите са с еднакъв цвят");
		} else if ((coordinatesFirstPoint % 2 == 0) && (coordinatesSecondPoint % 2 == 1)) {
			System.out.println("Позициите са с различен цвят");
		} else if ((coordinatesFirstPoint % 2 == 1) && (coordinatesSecondPoint % 2 == 0)) {
			System.out.println("Позициите са с различен цвят");
		} else {
			System.out.println("Позициите са с еднакъв цвят");
		}
	}

}
