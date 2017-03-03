/*
Задача 3: Да се изведат на екрана всички нечетни числа от -10 до 10
*/

import java.lang.Math;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = -10; i < 10; i++) {
			if (Math.abs(i) % 2 == 1) {
				System.out.println(i);
			}
		}
		
	}

}
