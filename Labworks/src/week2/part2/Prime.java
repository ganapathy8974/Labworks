package week2.part2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int temp,i=2;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
			System.out.println("Enter any number:");
		int num=scan.nextInt();
		scan.close();
		
		while(i<=num/2)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
			i++;
		}
		
		if(isPrime) {
			
			System.out.println(num + " is a Prime Number");
		}
		else {
			System.out.println(num + " is not a Prime Number");
		}
		
	}


}
