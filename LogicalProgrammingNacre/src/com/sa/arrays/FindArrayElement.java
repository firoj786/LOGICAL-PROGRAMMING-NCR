package com.sa.arrays;
import java.util.Scanner;
/*WAP to find the given element is available in the given array
or not using linear search technique
*/
public class FindArrayElement {
public static void main(String[] args) {
		 int n, key, flag=0;
			Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of array: ");
		    n=sc.nextInt();
		    int a[] = new int[n];
		 System.out.println("Enter elements into array::"+n);
		    for(int i=0; i<n; i++){
		    	    	a[i]=sc.nextInt();
		    	    }
		    System.out.println("Enter the elements to be searched::");
		    key=sc.nextInt();
		    for(int i=0; i<n; i++){
		        if(a[i]==key){
		        	 System.out.println(" fount at  position :"+ key+"\t"+ i);
		           flag=1;
		           break;
		        }
		    }
		    if(flag==0)
		       System.out.println ("not  found:"+key);
		     else 
		   System.out.println(" found:"+key);
		    
	}
}


