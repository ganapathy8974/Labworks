package week2.part2;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		System.out.println("Enter a Month in Number: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		in.close();
		if(month>=12 && month<=1) {
			System.out.println("This is Winter.");
		}else if(month>=2 && month<=3) {
			System.out.println("This is Spring");
		}else if(month>=4 && month<=6) {
			System.out.println("This is Summer");
		}else if(month>=7 && month <= 9) {
			System.out.println("This is Monsoon");
		}else{
			System.out.println("This is Autumn");
		}
	}

}