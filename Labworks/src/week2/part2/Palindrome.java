package week2.part2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int enterednum, number, reverse=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number:");
		enterednum = in.nextInt();
		System.out.println("Enterd Number is "+enterednum);
		number = enterednum;
		while(number !=0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number/10;			
		}
		System.out.println("Reversed Number is "+reverse);
		if(enterednum==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	

}
