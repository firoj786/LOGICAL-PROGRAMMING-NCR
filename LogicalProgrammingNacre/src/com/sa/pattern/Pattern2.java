package com.sa.pattern;
/*
5
5  4
5   4  3
5  4  3  2
5  4  3  2  1
*/
public class Pattern2{
	public static void main(String[] args) {
	    int temp=5;
	    for(int i=5; i>=1; i--){
	        for(int j=5; j>=i; j--){
	            System.out.println(" \t"+j);
	        }
	       System.out.println();
	    }
	}
}