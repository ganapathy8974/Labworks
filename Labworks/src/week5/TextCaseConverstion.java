package week5;
/*
 * Write a program to get a character from user and display whether it is a letter (lowercase/uppercase) or digit or space.
 */

import java.util.Scanner;

public class TextCaseConverstion {

	public static void main(String[] args) {
		String text;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Text Here: ");
		text = scan.next();
		String upcase = text.toUpperCase();
		String lowcase = text.toLowerCase();
		System.out.println("Uppercase String is = "+upcase);
		System.out.println("Lowercase String is - "+lowcase);
	}

}
