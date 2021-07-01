package week2.part2;

import java.util.Scanner;

public class MidPoint {
	public static void main(String[] args) {
		double num1, num2, ans;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = in.nextDouble();
		System.out.println("Enter Second Number:");
		num2 = in.nextDouble();
		ans = (num1+num2)/2;
		System.out.println("Mind Point Of Given Number = "+ ans);
	}
}
