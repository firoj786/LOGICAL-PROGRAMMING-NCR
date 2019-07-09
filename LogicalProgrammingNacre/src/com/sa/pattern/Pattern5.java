package com.sa.pattern;
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public class Pattern5{
	public static void main(String[] args) {
		for(int i=5; i>=1; i--){
	        for(int j=1; j<=i; j++) {
		            System.out.print("\t"+j);
		        }
		       System.out.println();
		    }
	}
	}