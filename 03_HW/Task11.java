import java.util.Scanner;

/*
Задача 11:
Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа
*/
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 7;
		int[] arr = new int[n];
		int count = 0;
		
		while (n > 0) {
			arr[7 - n] = sc.nextInt();
			n--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		
		System.out.println(count + " числа");
	}

}
