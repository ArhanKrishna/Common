/*PROGRAM TO PRINT THE ENTIRE FILE*/


package com.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFile {

	public void printFile(String filePath) throws FileNotFoundException{
		
		File file=new File(filePath);
		Scanner sc=new Scanner(file);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		
		String path="C:\\WORK\\PrintFile.java";
		//String path="<file-location>";
		PrintFile so=new PrintFile();
		try {
			so.printFile(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
