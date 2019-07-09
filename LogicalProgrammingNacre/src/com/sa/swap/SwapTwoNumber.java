package com.sa.swap;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		 int a, b, temp;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter The Value of a:\t");
		    a=sc.nextInt();
		    b=sc.nextInt();
		  System.out.println("Before swapping\t:"+a+"\t"+b);
		    temp=a;
		    a=b;
		    b=temp;
		    System.out.println("Before swapping\t:"+a+"\t"+b);
		   	}
}

