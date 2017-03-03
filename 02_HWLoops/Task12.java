/*
Задача 12: Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат..
*/
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 999; i++) {
			int number = i;
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			boolean haveTwoSameDigits = false;
			
			if (firstDigit == secondDigit || firstDigit == thirdDigit 
					|| secondDigit == thirdDigit) {
				haveTwoSameDigits = true;
			}
			
//			if (number / 100 == number % 10) {
//				haveTwoSameDigits = true;
//			}
//			while (number > 0 ) {
//				lastDigit = digit;
//				digit = number % 10;
//				if (lastDigit == digit) {
//					haveTwoSameDigits = true;
//					break;
//				}
//				number /= 10;
//			}
			
			if (haveTwoSameDigits) {
				continue;
			}
			System.out.println(number);
		}
	}

}
