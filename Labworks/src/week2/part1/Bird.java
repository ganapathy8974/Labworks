package week2.part1;

public class Bird {
	int age;
	String name;
	Bird(){
		System.out.println("This is the parrot");
	}
	Bird(String x){
		name =x;
		System.out.println("This i the "+name);
	}
	Bird(int y, String z){
		age=y;
		name=z;
		System.out.println("This is the"+age+"Years\t"+name);
	}
	public static void main(String[] args) {
		Bird a=new Bird();
		Bird b=new Bird("Maina");
		Bird C=new Bird(20, "Sparrow");
	}
}
