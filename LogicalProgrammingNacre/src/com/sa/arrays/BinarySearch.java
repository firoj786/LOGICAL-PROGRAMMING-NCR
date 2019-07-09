package com.sa.arrays;

import java.util.Scanner;

/*WAP to find the given element is available in the given array
or not using Binary search technique
*/
public class BinarySearch {

	public static void main(String[] args) {
		int n, key, flag = 0, low, high, mid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of array:: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array::" + n);
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the elements to be searched::");
		key = sc.nextInt();
		low = 0;
		high = n - 1;
		mid = (low + high) / 2;
		while (low <= high) {
			if (key == a[mid]) {
			    System.out.println(" fount at position \t:"+key+"\t"+ mid);
				flag = 1;
				break;
			} else if (key > a[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}
		if (flag == 0) 
		    System.out.println(" not found::"+ key);
		    else
	    System.out.println(" found::"+key);
	}

}
