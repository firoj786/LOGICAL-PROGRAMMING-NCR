package com.sa.swap;
import java.util.Scanner;
public class NeonNumber {
public static void main(String[] args) {
		int num, sq, r, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number\t::");
		num = sc.nextInt();
		sq = num * num;
		while (sq > 0) {
			r = sq % 10;
			sum += r;
			//sum=sum+sq%10;
			sq = sq / 10;
		}
		if (sum == num) {
			System.out.println("Neon Number :"+num);
		} else {
			System.out.println("Not a Neon Number :"+num);
		}
	}

}
