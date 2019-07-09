package com.sa.swap;
//WAP to find the number is palindrome or not
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
		  int n, r,num, rev=0;
		  Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Year\t::");
		   n=sc.nextInt();
		    num=n;
		    while(n>0){
		        r=n%10;
		        rev=(rev*10)+r;
		       n= n/10;
		    }
		    if(num==rev){
		       System.out.println(" Palindrome number:"+num);
		    }
		    else{
		           System.out.println("not a Palindrome number:"+num);
		    }
	}

}
