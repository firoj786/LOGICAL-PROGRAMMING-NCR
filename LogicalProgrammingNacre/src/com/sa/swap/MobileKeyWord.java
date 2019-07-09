package com.sa.swap;

import java.util.Scanner;
//WAP to Mobile Key Paid
public class MobileKeyWord {
public static void main(String[] args) {
		char[] str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string\t::");
		str = sc.next().toCharArray();
		// gets(str);
		for (int i = 0; str[i] != '\0'; i++) {
			if (str[i] == 'a' || str[i] == 'A' || str[i] == 'b' || str[i] == 'B' || str[i] == 'c' || str[i] == 'C') {
				System.out.println("2");
			} else if (str[i] == 'd' || str[i] == 'D' || str[i] == 'e' || str[i] == 'E' || str[i] == 'f'
					|| str[i] == 'F') {
				System.out.println("3");
			} else if (str[i] == 'g' || str[i] == 'G' || str[i] == 'h' || str[i] == 'H' || str[i] == 'i'
					|| str[i] == 'I') {
				System.out.println("4");
			} else if (str[i] == 'j' || str[i] == 'J' || str[i] == 'k' || str[i] == 'K' || str[i] == 'l'
					|| str[i] == 'L') {
				System.out.println("5");
			} else if (str[i] == 'm' || str[i] == 'M' || str[i] == 'n' || str[i] == 'N' || str[i] == 'o'
					|| str[i] == 'O') {
				System.out.println("6");
			} else if (str[i] == 'p' || str[i] == 'P' || str[i] == 'q' || str[i] == 'Q' || str[i] == 'r'
					|| str[i] == 'R' || str[i] == 's' || str[i] == 'S') {
				System.out.println("7");
			} else if (str[i] == 't' || str[i] == 'T' || str[i] == 'u' || str[i] == 'U' || str[i] == 'v'
					|| str[i] == 'V') {
				System.out.println("8");
			} else if (str[i] == 'w' || str[i] == 'W' || str[i] == 'x' || str[i] == 'X' || str[i] == 'y'
					|| str[i] == 'Y' || str[i] == 'z' || str[i] == 'Z') {
				System.out.println("9");
			} else if (str[i] == ' ') {
				System.out.println("0");
			}
		}
	}
}
