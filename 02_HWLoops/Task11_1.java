import java.util.Scanner;

/*
  *		
 * *
*****
			 	*    
			   * *   
			  *   *  
			 *     * 
			*********
Допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.*/
public class Task11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за N:");
		int n = sc.nextInt();
		
		char blank = ' ';
		char star = '*';
		int endOfBlanks = n - 2;
		int endOfStars = 1;
		int startOfBlanks = 1;
		
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				for (int j = n - 1; j > 0; j--) {
					System.out.print(blank);
				}
				System.out.print(star);
				for (int j = n - 1; j > 0; j--) {
					System.out.print(blank);
				}
			} else if (i == n - 1) {
				for (int j = 0; j < 2 * n - 1; j++) {
					System.out.print(star);
				}
			} else {
				for (int j = endOfBlanks; j > 0; j--) {
					System.out.print(blank);
				}
				
				System.out.print(star);
				
				for (int j = 1; j <= startOfBlanks; j++) {
					System.out.print(blank);
				}
				
				System.out.print(star);
				
				startOfBlanks += 2;
				endOfBlanks--;
			}
			
			System.out.println();
		}
	}

}
