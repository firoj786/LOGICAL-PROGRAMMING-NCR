package com.sa.swap;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		 char ch;
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the character\t:");
		    ch = sc.next().charAt(0);
		    switch(ch){
		    case 'a':
		    case 'A':
		    case 'e':
		    case 'E':
		    case 'i':
		    case 'I':
		    case 'o':
		    case 'O':
		    case 'u':
		    case 'U':
		        System.out.println(" vowel::"+ch);
		        break;
		    default:
		        System.out.println("consonant::"+ch);
		    }
	}

}
