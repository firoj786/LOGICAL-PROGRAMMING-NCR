package com.sa.arrays;
//WAP to sort an array element
import java.util.Scanner;
public class SortArray {
public static void main(String[] args) {
   int n, temp;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of array: ");
    n=sc.nextInt();
    int a[] = new int[n];
 System.out.println("Enter elements into array:"+n);
    for(int i=0; i<n; i++){
    	a[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.println("Print the sorted element\t");
    for(int i=0; i<n; i++){
        System.out.print("\t"+a[i]);
    }
	}
}
