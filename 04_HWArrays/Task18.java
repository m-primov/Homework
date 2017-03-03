/*
Задача 18:
Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива

Пример:
18 19 32 1 3 4 5 6 7 8
1 2 3 4 5 16 17 18 27 11
Изход:
18,19,32 ,4,5,16,17,18,27,11
*/
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете стойност за дължината на първия масива:");
		int n = sc.nextInt();
		
		System.out.println("Въведете стойност за дължината на втория масива:");
		int m = sc.nextInt();
		
		int maxLength = n >= m? n : m;
		
		int[] firstArr = new int[n];
		int[] secondArr = new int[m];
		
		for (int i = 0; i < firstArr.length; i++) {
			System.out.println("Въведете стойност за numbers[" + i + "]:");
			firstArr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < secondArr.length; i++) {
			System.out.println("Въведете стойност за numbers[" + i + "]:");
			secondArr[i] = sc.nextInt();
		}
		
		int smallestLength = firstArr.length < secondArr.length?firstArr.length:secondArr.length;
		int[] compareArr = new int[smallestLength];
		
		for (int i = 0; i < smallestLength; i++) {
			if (firstArr[i] >= secondArr[i]) {
				compareArr[i] = firstArr[i];
			} else {
				compareArr[i] = secondArr[i];
			}
		}
		
		System.out.println("Първи въведен масив:");
		for (int i = 0; i < firstArr.length; i++) {
			if (i == firstArr.length - 1) {
				System.out.println(firstArr[i]);
			} else {
				System.out.print(firstArr[i] + ",");
			}
		}
		
		System.out.println("Втори въведен масив:");
		for (int i = 0; i < secondArr.length; i++) {
			if (i == secondArr.length - 1) {
				System.out.println(secondArr[i]);
			} else {
				System.out.print(secondArr[i] + ",");
			}
		}
		
		System.out.println("Масив от по-големите числа:");
		for (int i = 0; i < compareArr.length; i++) {
			if (i == compareArr.length - 1) {
				System.out.println(compareArr[i]);
			} else {
				System.out.print(compareArr[i] + ",");
			}
		}
		
	}

}
