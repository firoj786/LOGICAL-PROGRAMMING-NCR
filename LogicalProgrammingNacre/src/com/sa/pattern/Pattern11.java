package com.sa.pattern;
/*
0
1 0
1 0 1
0 1 0 1
0 1 0 1
*/
public class Pattern11{
	public static void main(String[] args) {
		 int n=5, temp=1;
		    for(int i=1; i<=n; i++){
		        for(int j=1; j<=i; j++){
                            if(temp%2==0){
		                System.out.print(" 0");
		            }
		        else{
		                System.out.print(" 1");
		            }
		            temp++;
		        }
		       System.out.println(" ");
		  }
}
}