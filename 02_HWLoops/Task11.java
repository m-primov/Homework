/*
Задача 11: Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
  *
 ***
*****
.................
Кaто допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.
*/
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за N:");
		int n = sc.nextInt();
		
		char blank = ' ';
		char star = '*';
		int endOfBlanks = n - 1;
		int endOfStars = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = endOfBlanks; j > 0; j--) {
				System.out.print(blank);
			}
			for (int j = 1; j <= endOfStars; j++) {
				System.out.print(star);
			}
			
			endOfStars += 2;
			endOfBlanks--;
			System.out.println();
		}
		
	}

}
