/*
Задача 14:
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2
*/
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				count++;
			}
		}
		
		double[] choosenElements = new double[count];
		
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				choosenElements[j] = arr[i];
				j++;
				if (j == choosenElements.length) {
					break;
				}
			}
		}
		
		System.out.println("Масивът със стойности от интервала [-2.99..2.99] е:");
		for (int i = 0; i < choosenElements.length; i++) {
			if (i == choosenElements.length - 1) {
				System.out.print(choosenElements[i]);
			} else {
				System.out.print(choosenElements[i] + "; ");
			}
		}
	}

}
