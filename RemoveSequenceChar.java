/*
 * Program to remove sequential characters in a string
 * Example : Given string is "axefyzijkmo"
 * Start from left to right - as letters 'e','f' are in sequence - remove them and word becomes - "axyzijkmo"
 * Again start from left to right - as letters 'x', 'y', 'z' are in sequence - remove them and word becomes - "aijkmo"
 * Same as above - "aijkmo" - 'i','j','k' - "amo"
 * Since no letters are in sequence, result is "amo"
 * For word like "abcdefg" result is null
 */

package com.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RemoveSequenceChar {

	public static int charDiff(String s,int c1, int c2) {
		
		int n1 = s.charAt(c1);
		int n2 = s.charAt(c2);
		return n2-n1;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter your word : \n");
		String s1;
		
		Scanner sc = new Scanner(System.in);
		s1 = sc.next().toLowerCase();
		sc.close();
		
		String s2 = "";
				
		int n = s1.length();
		boolean end = false;
		
		while(!end) {
			
			int i = 0;
			int j = 1;
			int rep = 0;
			int k;
			
			while(rep == 0) {
				
				if(charDiff(s1,i,j) == 1) {
					
					s2 = s2+s1.charAt(i)+s1.charAt(j);
					k = i;
					
					while(rep == 0) {
						
						k++;
						j++;
						if(charDiff(s1,k,j) == 1) {
							s2=s2+s1.charAt(j);
						}else {
							rep=1;
						} 
						if(j==n-1){
							end=true;
							rep =1;
						}
					}
					s1 = s1.replace(s2, "");
					s2 = "";
					n = s1.length();
					
				}else {
					i++;
					j++;
				}
				if(j == n-1){
					end = true;
					rep = 1;
				}
			}
		}
		if(s1.equals("")) {
			
			System.out.println("All letters got sequence");
			
		}else {
			
			System.out.println("Final word : "+s1);
		}
	}
}

