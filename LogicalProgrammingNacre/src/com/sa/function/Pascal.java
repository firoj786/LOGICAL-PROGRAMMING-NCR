package com.sa.function;
import java.util.Scanner;
public class Pascal{
	public static void main(String[] args) {
		 int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number:");
		    n=sc.nextInt();
		    for(int i=0; i<=n;i++){
		        for(int j=0;j<=n-i-1;j++){
		        	   System.out.println("");
		        }
		        for(int k=0;k<=i;k++){
		        	   System.out.print("\t"+fact(i)/(fact(i-k)*fact(k)));
		        }
		       System.out.println("\t");
		    }
		}
		static int fact(int x){
		    int fact=1;
		    for(int i=1;i<=x;i++){
		        fact*=i;
		    }
		    return fact;
		}
	

}
