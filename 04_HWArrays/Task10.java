import java.util.Scanner;

/*
Задача 10:
Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1 2 3 4 5 6 7
Изход: средна стойност 4, най-близка стойност 4
*/
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 7;
		int[] arr = new int[n];
		
		System.out.println("Въведете 7 числа за елементите на масива:");
		while (n > 0) {
			arr[7 - n] = sc.nextInt();
			n--;
		}
		
		int nearestNumber = 0;
		double sumElements = 0;
		double averageValueElements = 0;
		double difference = 0;
		double minimumDifference = Double.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			sumElements += arr[i];
		}
		
		averageValueElements = sumElements / arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > averageValueElements) {
				difference = arr[i] - averageValueElements;
			} else {
				difference = averageValueElements - arr[i];
			}
			
			if (difference < minimumDifference) {
				minimumDifference = difference;
				nearestNumber = arr[i];
			}
		}
		
		System.out.println("Най-близкото число от масива до средната стойност на въведените числа е:" + nearestNumber);
	}

}
