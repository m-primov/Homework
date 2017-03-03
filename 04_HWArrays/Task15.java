/*
Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
*/

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на масива:");
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете стойност за елемент[" + i + "]:");
			arr[i] = sc.nextDouble();
		}
		
		int turns = 2;
		double sumPositive = 0;
		double bestSumPositive = 0;
		double sumNegative = 0;
		double bestSumNegative = 0;
		int position = 0;
		double biggestNum = Double.MIN_VALUE;
		double smallestNum = Double.MAX_VALUE;
		double[] threeBiggestPositiveNums = new double[3];
		double[] threeSmallestNegativeNums = new double[3];
		
		do {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > biggestNum) {
					biggestNum = arr[i];
					position = i;
				}
			}
			sumPositive += arr[position];
			if (sumPositive > bestSumPositive) {
				bestSumPositive = sumPositive;
			}
			threeBiggestPositiveNums[turns] = arr[position];
			if (arr[position] > 0) {
				arr[position] = 0;
			}
			biggestNum = Double.MIN_VALUE;
			turns--;
		} while (turns >= 0);
		
		position = 0;
		turns = 0; 
		do {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < smallestNum) {
					smallestNum = arr[i];
					position = i;
				}
			}
			sumNegative += arr[position];
			if (sumNegative > bestSumNegative) {
				bestSumNegative = sumNegative;
			}
			threeSmallestNegativeNums[turns] = arr[position];
			arr[position] = 0;
			smallestNum = Double.MAX_VALUE;
			turns++;
		} while (turns < 3);
		
		if (bestSumNegative < bestSumPositive) {
			for (int i = 0; i < threeBiggestPositiveNums.length; i++) {
				System.out.print(threeBiggestPositiveNums[i] + " ");
			}
		} else {
			for (int i = 0; i < threeSmallestNegativeNums.length; i++) {
				System.out.print(threeSmallestNegativeNums[i] + " ");
			}
		}
		
	}

}
