/*
Задача 10:
Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
Пример: 107
Изход: 21 пъти по 2 литра,
21 пъти по 3 литра
допълнително кофа от 2 литра
*/
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете обем на цистерната:");
		int capacity = sc.nextInt();
		
		int firstBucketCapacity = 2;
		int secondBucketCapacity = 3;
		int twoBucketsCapacity = firstBucketCapacity + secondBucketCapacity;
		
		int timesToFill = capacity / twoBucketsCapacity;
		int additionalBucket = capacity - (timesToFill * twoBucketsCapacity);
		
		System.out.format(" %d пъти по 2 литра, %n %d пъти по 3 литра %n допълнителна кофа от %d литра",
				timesToFill, timesToFill, additionalBucket);
	}

}
