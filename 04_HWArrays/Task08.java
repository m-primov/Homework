import java.util.Iterator;

/*
Задача 8:
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
*/
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 1, 2, 2, 2, 1, 1, 3};
		int num = arr[0];
		int elementToPrint = arr[0];
		int length = 1;
		int bestLength = 1;
		
		System.out.println("Най-дългата редица от поредни еднакви елементи е:");
		/*if (arr.length > 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					length++;
					if (length > bestLength) {
						elementToPrint = arr[i];
						bestLength = length;
					} 
				} else {
					length = 1;
				}
			}
			
			for (int i = 0; i < bestLength; i++) {
				System.out.print(elementToPrint + " ");
			}
		} else {
			System.out.println(arr[0]);
		}*/
		
		for (int i = 1; i < arr.length; i++) {
			if (num == arr[i]) {
				length++;
				if (length > bestLength) {
					bestLength = length;
					elementToPrint = num;
				}
			} else {
				num = arr[i];
				length = 1;
			}
		}
		
		if (bestLength != 0) {
			for (int i = 0; i < bestLength; i++) {
				System.out.print(elementToPrint + " ");
			}
		} else {
			System.out.println(elementToPrint);
		}
		
		
	}

}
