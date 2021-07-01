package week2.part2;

import java.util.Scanner;

public class SumInteger {
	public static void main(String[] args) {
		int sum = 0, num =0, n=0;
		System.out.println("Enter the Number:");
		Scanner in=new Scanner(System.in);
		num = in.nextInt();
		int temp = num;
		while(num!=0) {
			n = num % 10;
			sum = sum +n;
			num = num /10;
		}
		System.out.println("Sum of Entered Integer is = "+sum);
	}
}
