package week2.part2;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		int i =0;
		System.out.println("Enter the Upto Range:");
		Scanner in = new Scanner(System.in);
		int range = in.nextInt();
		while(i<range) {
			if(i%2!=0) {
				System.out.println(i+" is Odd Number");
			}
			i++;
		}
	}
}
