/*
Задача 15:
Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
Пример: 10
Изход: Добър ден
*/
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете естествено число от интервала [0..24]:");
		int hour = sc.nextInt();
		
		if ((0 <= hour && hour <= 4) || (18 <= hour && hour < 0)) {
			System.out.println("Добър вечер");
		} else if (4 <= hour && hour <= 9) {
			System.out.println("Добро утро");
		} else {
			System.out.println("Добър ден");
		}
	}

}
