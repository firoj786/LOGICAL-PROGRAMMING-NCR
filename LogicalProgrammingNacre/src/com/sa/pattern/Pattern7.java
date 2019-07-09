package com.sa.pattern;
/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
*/
public class Pattern7{
	public static void main(String[] args) {
		 for(int i=1; i<=5; i++){
		        for(int j=i; j<=5; j++){
		            System.out.print("\t"+i);
		        }
		       System.out.println();
		    }
	}
	}