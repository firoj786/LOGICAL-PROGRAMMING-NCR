package com.sa.pattern;
/*
1 2 3 4 5
6 7 8 9
10 11 12
13 14
15
*/
public class Pattern9{
	public static void main(String[] args) {
		 int temp=1;
		    for(int i=5; i>=1; i--){
		        for(int j=1; j<=i; j++){
		            System.out.print("\t"+temp++);
		            //temp++;
		        }
		       System.out.println();
		    }
	}
	}