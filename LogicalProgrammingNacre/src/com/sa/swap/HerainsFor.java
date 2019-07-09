package com.sa.swap;

import java.util.Scanner;
public class HerainsFor {
	public static float sqrt(float a, float b, float c) {
		float s=(a+b+c)/2;
		float area=((s*(s-a)*(s-b)*(s-c)));
		return area;
	}
	public static void main(String[] args) {
		 float a, b, c;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the sides of the triangle::");
		    a=sc.nextFloat();
		    b=sc.nextFloat();
		    c=sc.nextFloat();
		    System.out.println("\t the area of triangle :"+sqrt(a, b, c));
	}

}
