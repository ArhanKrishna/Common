package com.common;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Enter number to reverse :\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		while(n >= 1) {
			int temp = n%10;
			res = (res*10)+temp;
			n = n/10;
		}
		System.out.println("Number after reverse : "+res);
		sc.close();
	}

}
