/*
Задача 16:
Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249
Изход: 200,150,100, 50.
*/
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за N от интервала [10..5555]:");
		int n = sc.nextInt();
		System.out.println("Въведете число за M от интервала [10..5555]:");
		int m = sc.nextInt();
		
		if ((10 <= n && n <= 5555) && (10 <= m && m <= 5555)) {
			if (n < m) {
				for (int i = m; i >= n; i--) {
					if (i % 50 != 0) {
						continue;
					}
					System.out.print(i + " ");
				}
			} else {
				for (int i = n; i >= m; i--) {
					if (i % 50 != 0) {
						continue;
					}
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Невалидни входни данни");
		}
	}

}
