/*
Задача 1:
Да се състави програма, която изчислява N-тото число на Фибоначи.
Първото и второто число на Фибоначи са 1-ци, всяко следващо е равно
на сбора на предходните 2.
Пример: 8
Изход: 21
Първите 5 числа на Фибоначи са : 1, 1, 2, 3, 5, 8, 13, 21
*/
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		long n = sc.nextInt();
		
		long nNumberFibonaci = fibonaciNumber(n);
		
		System.out.println(n + " number of Fibonaci is " + nNumberFibonaci);
	}
	
	static int fibonaciNumber(long num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		
		return fibonaciNumber(num - 1) + fibonaciNumber(num - 2);
	}

}
