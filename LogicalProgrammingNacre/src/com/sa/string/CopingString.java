package com.sa.string;
//WAP to copy of the string in java
import java.util.Scanner;
public class CopingString {
public static void main(String[] args) {
		String str;
	      Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a String : ");
	      str = sc.nextLine();
	      System.out.print("Copying String...:");
	       StringBuffer strCopy = new StringBuffer(str);
	      System.out.print("String Copied Successfully..!!\t::");      
	      System.out.print("The Copied String is :" + strCopy);
	}

}
