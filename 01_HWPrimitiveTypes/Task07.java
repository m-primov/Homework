/*
Задача 7:
Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
- ако съм болен, няма да излизам
- ако имам пари, ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав, ще отида на кино с приятели
- ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата.
*/
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час:");
		int hour = sc.nextInt();
		System.out.println("Въведете стойността на наличните ви пари:");
		double money = sc.nextDouble();
		System.out.println("Въведете дали сте здрав или болен:");
		boolean amIHealthy = sc.nextBoolean();
		
		if (!amIHealthy) {
			System.out.println("Няма да излизам");
			if (money > 0) {
				System.out.println("Ще си купя лекарства");
			} else {
				System.out.println("Ще стоя вкъщи и ще пия чай");
			}
		} else {
			System.out.println("Ще отида на кино с приятели");
			if (money < 10) {
				System.out.println("Ще отида на кафе");
			}
		}
	}

}
