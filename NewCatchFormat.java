/*
 * PROGRAM TO ILLUSTRATE NEW CATCH FORMAT FROM JAVA 1.7
 */

package com.common;

public class NewCatchFormat {

	public static void main(String[] args) {
		
		try{
			
			int ab=Integer.parseInt("abc");
			System.out.println(ab);
			
			int z=12/0;
			System.out.println(z);
			
			String s=null;
			System.out.println(s.charAt(0));
			
		}catch(ArithmeticException | NumberFormatException | NullPointerException e){
			
			e.printStackTrace();
		}

	}

}
