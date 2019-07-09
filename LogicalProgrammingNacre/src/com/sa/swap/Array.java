package com.sa.swap;

public class Array {

	public static void main(String[] args) {
		  int a1[]={2,4,5,6};
		    int a2[]={2,7,9,10};
		    int n=4,count1=0,count2=0;
		    for(int i=0;i<n;i++){
		        count1=0;
		        count2=0;
		        for(int j=0;j<n;j++){
		            if(a1[i]==a2[j]){
		                count1=1;
		            }
		            if(a2[i]==a1[j]){
		                count2=1;
		            }

		        }
		        if(count1==0){
		            System.out.println("\t"+a1[i]);
		        }
		        if(count2==0){
		            System.out.println(" \t"+a2[i]);
		        }
		    }
	}

}
