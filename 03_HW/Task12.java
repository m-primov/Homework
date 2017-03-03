/*
Задача 12:
Да се състави програма, чрез която по предварително въведени 7
числа в едномерен масив се разменят местата на елементи с индекси:
- 0 и 1 чрез трета променлива;
- 2 и 3 чрез събиране;
- 4 и 5 чрез умножение.
Пример: 1,2,3,4,5,6,7
Изход: 2,1,4,3,6,5,7
*/
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i += 2) {
			if (i == 0) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			} else if (i == 2) {
				arr[i] = arr[i] + arr[i + 1];
				arr[i + 1] = arr[i] - arr[i + 1];
				arr[i] = arr[i] - arr[i + 1];
			} else if (i == 4) {
				arr[i] = arr[i] * arr[i + 1];
				arr[i + 1] = arr[i] / arr[i + 1];
				arr[i] = arr[i] / arr[i + 1];
			}
		}
		
		System.out.println("Масивът с разменени елементи е:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
