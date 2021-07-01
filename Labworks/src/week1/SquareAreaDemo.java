package week1;
import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		System.out.println("Enter the side of Square: ");
		Scanner in = new Scanner(System.in);
		double side = in.nextDouble();
		double area = side * side;
		System.out.println("Area of Square" + area);
	}

}
