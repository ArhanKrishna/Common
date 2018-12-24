/*
 * PROGRAM TO FIND WHETHER THE GIVEN ELEMENT IS A NUMBER OR DECIMAL OR CHARACTER OR STRING 
 */

package com.common;

import java.util.Scanner;

public class ElementType {

	public void findElement(String input){
		
		try{
			
			int ab=Integer.parseInt(input);
			System.out.println("Given element "+ab+" is a Number");
			System.exit(0);
			
		}catch(Exception e1){
			
			try{
				
				double cd=Double.parseDouble(input);
				System.out.println("Given element "+cd+" is a Decimal");
				System.exit(0);
				
			}catch(Exception e2){
				
				if(input.length()==1){
					
					System.out.println("Given element "+input+" is a Character");
					System.exit(0);
					
				}else{
					
					System.out.println("Given element "+input+" is a String");
					System.exit(0);
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		ElementType sf=new ElementType();
		System.out.println("Give element :");
		Scanner sc=new Scanner(System.in);
		String given=sc.next();
		sc.close();
		sf.findElement(given);
	}

}
