package com.sa.swap;

import java.util.Scanner;

public class ToN_PrimeNum {

	public static void main(String[] args) {
		 int num, fact=0;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Num\t:");
		    num=sc.nextInt();
		    for(int i=2;i<=num; i++){
		        fact=0;
		        for(int j=2; j<=i/2; j++){
		            if(i%j==0){
		                fact=1;
		                break;
		            }
		        }
		        if(fact==0){
		            System.out.println("Prime Number::"+i);
		        }
		        else {
		        	System.out.println("Not Prime Numver:"+i);
		        }
	}
	}
	}



