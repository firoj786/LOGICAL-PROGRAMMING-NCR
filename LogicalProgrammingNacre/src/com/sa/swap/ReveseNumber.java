package com.sa.swap;

import java.util.Scanner;

public class ReveseNumber {

	public static void main(String[] args) {
		int n, r, num, rev=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Year\t:");
	    n=sc.nextInt();
	    num=n;
	    while(n!=0){
	        r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	    }
	    System.out.println("\tThe reverse of ::"+num+"\t"+rev);
	}

}
