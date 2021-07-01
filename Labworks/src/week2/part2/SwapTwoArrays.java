package week2.part2;

public class SwapTwoArrays {
	public static void main(String[] args) {
		int []num1 = new int[] {1,2,3,4,5};
		int []num2 = new int[] {6,7,8,9,10};
		
		System.out.println("Before Swap");
		for(int i=0;i<num1.length;i++) {
			System.out.print(num1[i]+"\t");
		}
		System.out.println("");
		for(int i=0;i<num1.length;i++) {
			System.out.print(num2[i]+"\t");
		}
		System.out.println("");
		
		for(int i=0;i<num1.length;i++) {
			num1[i] = num1[i] + num2[i];
			num2[i] = num1[i] - num2[i];
			num1[i] = num1[i] - num2[i];
		}
		System.out.println("After Swap");
		for(int i=0;i<num1.length;i++) {
			System.out.print(num1[i]+"\t");
		}
		System.out.println("");
		for(int i=0;i<num1.length;i++) {
			System.out.print(num2[i]+"\t");
		}
	}
}
