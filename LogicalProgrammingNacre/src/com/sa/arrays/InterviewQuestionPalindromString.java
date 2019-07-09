package com.sa.arrays;

public class InterviewQuestionPalindromString {
public static void main(String[] args) {
		int k=3,j=0,arr[]={1,2,3,4,5,6};
	    for(int i=0;i<6;i++){
	        if(i==3){
	        	 System.out.println("\t");
	        }
	        if(i<=2){
	        	 System.out.println("\t"+arr[i]);
	        }
	        else{
	            System.out.println(" \t"+arr[k]);
	        }
	        if(i<=2)
	            j++;
	        else
	            k++;
	}
	}
}
