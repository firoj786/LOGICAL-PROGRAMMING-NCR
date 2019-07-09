package com.sa.swap;

import java.util.Scanner;

public class SumNaturalNum {
	
	public static void main(String[] args) {
	   int n;
	   Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the value of N:");
		    n=sc.nextInt();
		    System.out.println("sum: "+sum(n));
		  
		}
		static int sum(int x){
		    if(x==1){
		        return 1;
		    }
		    else{
		        return(x+sum(x-1));
		    }
		}
	}


