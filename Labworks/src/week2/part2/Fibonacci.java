package week2.part2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0, n2=1,n3=0,length, i=0;
		System.out.println("Enter the Length:");
		Scanner in = new Scanner(System.in);
		length = in.nextInt();
		while(i<length){
			System.out.println(n1);	
			n3 = n1 + n2;
			n1 = n2;
			n2 =n3;					
			 i++;
		}

	}

}
