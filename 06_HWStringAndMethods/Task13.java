/*
Задача 13:
Да се създаде метод, който приема два масива от числа и връща
масив, съдържащ всички елементи на подадените масиви, като в
първата част на масива са елементите на първия подаден масив,
а във втората част – тези на втория подаден масив.
*/
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArr = {1, 2, 3, 4, 5};
		int[] secondArr = {6, 7, 8, 9, 10};
		combineArrays(firstArr, secondArr);
	}
	
	static void combineArrays(int[] firstArr, int[] secondArr) {
		System.out.print("[");
		for (int i = 0; i < firstArr.length; i++) {
				System.out.print(firstArr[i] + ", ");
		}
		for (int i = 0; i < secondArr.length; i++) {
			if (i == secondArr.length - 1) {
				System.out.print(secondArr[i]);
			} else {
				System.out.print(secondArr[i] + ", ");
			}
		}
		System.out.print("]");
	}
}
