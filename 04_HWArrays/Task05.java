/*
Задача 5:
Напишете програма, която създава масив с 10 елемента и
инициализира всеки от елементите със стойност, равна на индекса на
елемента, умножен по 3.
Да се изведат елементите на екрана.
*/
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
			System.out.print(arr[i] + " ");
		}
	}

}
