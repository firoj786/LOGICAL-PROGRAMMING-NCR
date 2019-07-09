package com.sa.string;

//WAP to palindrome  of the string
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
		a = s.nextLine();
		int n = a.length();
		// System.out.println("Enter an integer to check if it is odd or even: ");
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (n % 2 == 0)
			System.out.println("You entered an even number.");
		else
			System.out.println("You entered an odd number.");

		if (a.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not palindrome.");
		}

	}
}
