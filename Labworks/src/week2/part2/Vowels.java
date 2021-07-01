package week2.part2;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.println("Enter a Character in lower case:");
		Scanner in = new Scanner(System.in);
		char text = in.next().charAt(0);
		in.close();
		switch(text) {
		case 'a':		
			System.out.println("'A' is a Vowal Character.");
			break;
		case 'e':
			System.out.println("'E' is a Vowal Character.");
			break;
		case 'i':		
			System.out.println("'I' is a Vowal Character.");
			break;
		case 'o':
			System.out.println("'O' is a Vowal Character.");
			break;
		case 'u':
			System.out.println("'U' is a Vowal Character.");
			break;
		default:
			System.out.println("Entered Character is not Vowal.");
		}
	}

}
