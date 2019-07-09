package com.sa.swap;
import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
		 int a, b;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the vale of a & b\t:");
		    a=sc.nextInt();
		    b=sc.nextInt();
		    System.out.println("GCD\t:"+gcd(a,b));
		    }
		static int gcd(int a, int b){
		      if(a%b==0){
		        return b;
		    }
		    else{
		        return gcd(b,a%b);
		        }
		    }
		}
