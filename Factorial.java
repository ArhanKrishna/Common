/*
 * PROGRAM TO FIND FACTORIAL OF GIVEN NUMBER 
 */
package com.common;

import java.util.Scanner;

public class Factorial {

	public int factWithOutRecur(int num) {
		
		int result=1;
		for(int i=1; i<=num; i++) {
			result=result*i;
		}
		return result;
	}
	
	public int factWithRecur(int num) {
		
		if(num == 0 || num == 1) {
			return 1;
		}else {
			return num*factWithRecur(num - 1);
		}
	}
	
	public static void main(String[] args) {

		Factorial fc = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial:\n");
		int key = sc.nextInt();
		sc.close();		
		//int factorial = fc.factWithOutRecur(key);
		int factorial = fc.factWithRecur(key);
		System.out.println("Factorial of "+key+" is :"+factorial);
	}

}
