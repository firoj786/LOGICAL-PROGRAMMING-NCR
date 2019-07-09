package com.sa.function;
import java.util.Scanner;
public class PrintCharforSpecificTime {
public static void main(String[] args) {
		    int n;
		    char ch;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Number\t:");
		    n=sc.nextInt();
		    System.out.print("Enter the char\t:");
		    ch=sc.next().charAt(0);		  
		    for(int i=1;i<=n;i++){
		    	   System.out.print("\t"+ch);
		    }
		 }
	 }
