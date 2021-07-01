package week2.part2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double num1,num2,ans;	
		
		System.out.print("Enter first number: ");
		num1=in.nextDouble();
		
		System.out.print("Enter second number: ");
		num2=in.nextDouble();
		
		System.out.println("Select a operation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		int ch=in.nextInt();
		
		switch(ch){
		case 1:
			ans=num1+num2;
			System.out.println("Result: "+ans);
			break;
		case 2:
			ans=num1-num2;
			System.out.println("Result: "+ans);
			break;
		case 3:
			ans =num1*num2;
			System.out.println("Result: "+ans);
			break;
		case 4:
			ans=num1/num2;
			System.out.println("Result: "+ans);
			break;
		default:
			System.out.println("Select Between 1 to 4 Only.");
			break;
		}
		
	}
}
