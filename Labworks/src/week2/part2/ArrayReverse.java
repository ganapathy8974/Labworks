package week2.part2;

public class ArrayReverse {

	public static void main(String[] args) {
		int []num1 = new int[5];		
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;
		for(int i=num1.length-1;i>=0;i--) {
			System.out.print(num1[i]+"\t");
		}
	}

}
