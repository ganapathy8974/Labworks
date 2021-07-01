package week2.part2;

import java.util.Scanner;

public class SwitchSeasons {

	public static void main(String[] args) {
		System.out.println("Enter a Month in Number");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		in.close();
		switch(month) {
		case 1:
			System.out.println("This is Winter.");
			break;
		case 2:
			System.out.println("This is Spring.");
			break;
		case 3:
			System.out.println("This is Spring.");
			break;
		case 4:
			System.out.println("This is Summer.");
			break;
		case 5:
			System.out.println("This is Summer.");
			break;
		case 6:
			System.out.println("This is Summer.");
			break;
		case 7:
			System.out.println("This is Monsoon.");
			break;
		case 8:
			System.out.println("This is Monsoon.");
			break;
		case 9:
			System.out.println("This is Monsoon.");
			break;
		case 10:
			System.out.println("This is Autumn.");
			break;
		case 11:
			System.out.println("This is Autumn.");
			break;
		case 12:
			System.out.println("This is Winter.");
			break;
		default:
			System.out.println("Enter a Month between 1 to 12.");
		}
	}

}
