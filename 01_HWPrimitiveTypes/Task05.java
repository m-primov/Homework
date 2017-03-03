/*
Задача 5:
Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
ред.
*/
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число:");
		int firstNum = sc.nextInt();
		System.out.println("Въведете второ число:");
		int secondNum = sc.nextInt();
		System.out.println("Въведете трето число:");
		int thirdNum = sc.nextInt();
		
//		if ((firstNum < secondNum && firstNum < thirdNum))
//        {
//            if(secondNum < thirdNum)
//            {
//                System.out.print(thirdNum + " " + secondNum + " " + firstNum);
//            }
//            else {
//                System.out.print(secondNum + " " + thirdNum + " " + firstNum);
//            }
//        }
//        else if ((secondNum < firstNum && secondNum < thirdNum))
//        {
//            if(firstNum < thirdNum)
//            {
//                System.out.print(thirdNum + " " + firstNum + " " + secondNum);
//            }
//            else
//                {
//                System.out.print(firstNum + " " + thirdNum + " " + secondNum);
//                }
//        }
//        else if ((thirdNum < firstNum && thirdNum < secondNum))
//        {
//            if(firstNum < secondNum)
//            {
//                System.out.print(secondNum + " " + firstNum + " " + thirdNum);
//            }
//            else
//                System.out.print(firstNum + " " + secondNum + " " + thirdNum);
//        }
		
		// Optimization
		int min = firstNum;
		int max = secondNum;
		
		if (firstNum > secondNum) {
			min = secondNum;
			max = firstNum;
		}
		
		if (thirdNum < min) {
			System.out.print(thirdNum + " " + min + " " + max);
		} else if (thirdNum > max) {
			System.out.print(min + " " + max + " " + thirdNum);
		} else {
			System.out.print(min + " " + thirdNum + " " + max);
		}
	}
}
