package week1;
import java.util.Scanner;

public class AreaTriangleDemo {

	public static void main(String[] args) {
		System.out.println("Enter the triangle height: ");
		Scanner in = new Scanner(System.in);
		double height = in.nextDouble();
		System.out.println("Enter the Triangle Width:");
		double width = in.nextDouble();
		double area = (width * height)/2;
		System.out.println("Area of Triangle:" + area);
	}

}
