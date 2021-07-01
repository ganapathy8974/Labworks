package week2.part1;

class Cs{
	int p,q;
	public Cs() {}
	public Cs(int x, int y) {
		p = x;
		q = y;
		
	}
	
	public int add(int i, int j) {
		return i + j;
	}
	
	public int add(int i, int j, int k) {
		return i+j+k;
	}
	
	public float add(float f1, float f2) {
		return f1+f2;
	}
	
	public void printData() {
		System.out.println("p = "+ p +"\n"+"q = "+q);
	}
}

public class ConstructorOverlaoding {

	public static void main(String[] args) {
		Cs c1 = new Cs();
		Cs c2 = new Cs(10,15);
		c2.printData();

		int g = c1.add(10, 15);
		int h = c1.add(10, 15, 56);
		float u = c1.add(10.1f, 20.6f);
		
		System.out.println("Ans = " + g);
		System.out.println("Ans = " + h);
		System.out.println("Ans = " + u);
	}

}
