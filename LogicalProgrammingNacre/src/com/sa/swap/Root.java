package com.sa.swap;

import java.util.Scanner;
public class Root {
	public static void main(String[] args) {
		 float a, b, c;
		    float d, x1,x2;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the vale of a,b,c\t:");
		    a=sc.nextFloat();
		    b=sc.nextFloat();
		    c=sc.nextFloat();
		    d=b*b-4*a*c;
		    if(d>0){
		       System.out.println("the root are real & not equal");
		        x1=(-b+sqrt(d))/(2*a);
		        x2=(-b-sqrt(d))/(2*a);
		        System.out.println("x1=%f and x2=%f::"+x1+"\t:"+x2);
		    }
		    else if(d==0){
		    	System.out.println("the root are real & equal");
		       x1=(-b+sqrt(d))/(2*a);
		        x2=(-b-sqrt(d))/(2*a);
		        System.out.println("x1=%f and x2=%f::"+x1+"\t:"+x2);
		    }
		    else{
		        System.out.println("the root are imaginary");
		        }
	}
public static float sqrt(float d) {
		return d;
	}
	

}
