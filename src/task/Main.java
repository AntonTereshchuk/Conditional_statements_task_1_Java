package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int firstInteger;
		int secondInteger;
		int thirdInteger;
		int fourthInteger;
		int maxInteger;
		
		System.out.println("Please enter the first integer: ");
		firstInteger = sc.nextInt();
		System.out.println("Please enter the second integer: ");
		secondInteger = sc.nextInt();
		System.out.println("Please enter the third integer: ");
		thirdInteger = sc.nextInt();
		System.out.println("Please enter the fourth integer: ");
		fourthInteger = sc.nextInt();
		
		maxInteger = firstInteger;
		
		if (maxInteger < secondInteger) {
			maxInteger = secondInteger;
		}
		if (maxInteger < thirdInteger) {
			maxInteger = thirdInteger;
		}
		if (maxInteger < fourthInteger) {
			maxInteger = fourthInteger;
		}
		
		System.out.println("Maximum of integers that hav been entered: " + maxInteger);

	}

}
