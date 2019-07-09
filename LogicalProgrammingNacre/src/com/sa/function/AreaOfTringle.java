package com.sa.function;

import java.util.Scanner;

/*Area = sqrt(s*(s-a)*(s-b)*(s-c))
where a, b and c are lengths of sides of
triangle and s = (a+b+c)/2*/
public class AreaOfTringle {

	public static void main(String[] args) {
		 int high, base;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Number:");
		    high=sc.nextInt();
		    base=sc.nextInt();
		    System.out.println("Area:"+area(high,base));
		    }
		static double area(int x, int y){
		    double area=.5*x*y;
		    return area;
	}

}
