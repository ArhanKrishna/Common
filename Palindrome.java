package com.common;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter anything to find or not palindrome :\n");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = "";
		int i = 0;
		while(i < s.length()) {
			res = res + s.charAt(i);
			i = i + 1;
		}
		if(s.equalsIgnoreCase(res)) {
			System.out.println(s+" is a palindrome");
		}else {
			System.out.println(s+" is not a palindrome");
		}
		sc.close();
	}

}
