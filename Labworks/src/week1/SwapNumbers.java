package week1;

public class SwapNumbers {
	public static void main(String[] args) {
		int first = 220, second =120;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second Number = " + second);

		first = first - second;
		second = first + second;
		first = second - first;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second Number = " + second);
	}
}
