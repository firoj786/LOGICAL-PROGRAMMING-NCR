package com.sa.pattern;

public class Matrix {
	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i <= 2; i++) {
			for (int j = 2; j >= 0; j--) {
				System.out.print("\t"+arr[j][i]);
			}
              System.out.println("\t");
		}
	}
}
