package com.sa.function;
//nCr = (n!) / (r! * (n-r)!)
import java.util.Scanner;
public class Ncr {
public static void main(String[] args) {
		 int n,r,ncr;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Number:");
		    n=sc.nextInt();
		    r=sc.nextInt();
		    ncr=fact(n)/(fact(n-r)*fact(r));
		    System.out.println("Ncr:"+ncr);
		   }
		static int fact(int x){
		    int fact=1;
		    for(int i=1;i<=x;i++){
		        fact*=i;
		    }
			return fact;
	}

}
