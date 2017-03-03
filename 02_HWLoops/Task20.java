/*
Задача 20:
Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
*/
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum = 0;
		for (int i = 1; i <= 10; i++) {
			startNum = 0;
			for (int j = i; j <= 10; j++) {
				if (j <= 9) {
					System.out.print(j + " ");
				} else {
					for (int k = 1; k <= i; k++) {
						System.out.print(startNum + " ");
						startNum++;
					}
				}
			}
			System.out.println();
		}
	}

}
