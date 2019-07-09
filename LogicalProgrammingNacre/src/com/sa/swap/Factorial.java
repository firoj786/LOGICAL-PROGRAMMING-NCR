package com.sa.swap;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
        int n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of N:");
	    n=sc.nextInt();
	    System.out.println("fact\t::"+fact(n));
	}
	static int fact(int x){
	    if(x==0){
	        return 1;
	    }
	    else{
	        return(x*fact(x-1));
	}
	}
}
