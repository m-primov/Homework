/*
Задача 2:
Да се състави програма, която изчислява произведение на две
естествени числа =>2, като се използва само събиране.
Входни данни: 2 естествени числа.
Пример: 4, 5
Изход: 20
*/
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 5;
		
		System.out.println(product(n, m));
	}
	
	public static long product(int a, int b){
		if(b == 1){
			return a;
		}
		return a + product(a, b - 1);
	}

}
