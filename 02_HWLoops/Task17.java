import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число в интервала [3..20] за страната на квадрата:");
		int side = sc.nextInt();
		System.out.println("Въведете символ:");
		char sign = sc.next().charAt(0);
		char star = '*';
		
		for (int j = 0; j < side; j++) {
			if ((j > 0 && j < side - 1)) {
				System.out.print(star);
				for (int k = 0; k < side - 2; k++) {
					System.out.print(sign);
				}
				System.out.print(star);
			} else {
				for (int i = 0; i < side; i++) {
					System.out.print(star);
				}
			}
			System.out.println();
		}
		
//		for (int i = 0; i < side; i++) {
//			System.out.print(star);
//		}
//		System.out.println();
//		for (int i = 1; i < side - 1; i++) {
//			System.out.print(star);
//			for (int j = 0; j < side - 2; j++) {
//				System.out.print(sign);
//			}
//			System.out.print(star);
//			System.out.println();
//		}
//		for (int i = 0; i < side; i++) {
//			System.out.print(star);
//		}
	}

}
