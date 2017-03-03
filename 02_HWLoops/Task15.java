/*
Задача 15: Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15

Използвайте цикъл do-while.
*/
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число n:");
		int inputNum = sc.nextInt();
		
		int sum = 0;
		int startNum = 1;
		if (inputNum >= 1) {
			do {
				sum += startNum;
				startNum++;
			} while (startNum <= inputNum);
		} else {
			do {
				sum += startNum;
				startNum--;
			} while (startNum >= inputNum);
		}
		
		
		System.out.println("Сумата на числата от 1 до " + inputNum + " е: " + sum);
	}

}
