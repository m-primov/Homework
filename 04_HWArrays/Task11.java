import java.util.Scanner;

/*
Задача 11:
Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23 -55 17 75 56 105 134
Изход: 75,105 - 2 числа
*/
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на масива:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		System.out.println("Въведете " + n + " стойности за елементите на масива:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
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
