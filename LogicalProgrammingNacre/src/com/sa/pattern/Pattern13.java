package com.sa.pattern;

/*7	5	3	1	3	5	7 

7	5	3	5	7 


7	5	7 

7*/
public class Pattern13{
	public static void main(String[] args) {
		 int n=4,temp=2*n-1,x=n;
		    for(int i=1;i<=n;i++){
		        int val=7;
		        for(int j=1;j<i;j++){
		        	 System.out.println(" ");
		        }
		        for(int k=1;k<=temp;k++){
		            if(k<x){
		                System.out.print("\t"+val);
		                val-=2;
		            }
		            else{
		            	  System.out.print ("\t"+val);
		                val+=2;
		            }
		        }
		        x--;
		        temp-=2;
		    }
		      
		  }
}
