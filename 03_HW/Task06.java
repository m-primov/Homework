import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число за дължината на първия масив:");
		int n = sc.nextInt();
		
		int[] firstArr = new int[n];
		
		System.out.println("Въведете " + n + " стойности за елементите на първи масив:");
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = sc.nextInt();
		}
		
		System.out.println("Въведете число за дължината на втория масив:");
		int m = sc.nextInt();
		
		int[] secondArr = new int[m];
		
		System.out.println("Въведете " + m + " стойности за елементите на втори масив:");
		for (int i = 0; i < secondArr.length; i++) {
			secondArr[i] = sc.nextInt();
		}
		
		boolean isLengthEqual = true;
		boolean areSame = true;
		
		if (firstArr.length != secondArr.length) {
			isLengthEqual = false;
			areSame = false;
		} else {
			for (int i = 0; i < firstArr.length; i++) {
				if (firstArr[i] != secondArr[i]) {
					areSame = false;
					break;
				}
			}
		}
		
		String outputSame = areSame?"Масивите са еднакви":"Масивите не са еднакви";
		System.out.println(outputSame);
		
		String outputLength = isLengthEqual?"Масивите са с еднаква дължина":"Масивите са с различна дължина";
		System.out.println(outputLength);
	}

}
