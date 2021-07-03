package week5;
/*
 * Create a simple counting thread. It will count to 100, pausing one second 
 * between each number. Also, in keeping with the counting theme, it will output a string for every ten numbers.
 */
public class CountingDemo {

	public static void main(String[] args) {
		Count countobj = new Count();
		
		Thread counting = new Thread(new CountJob(countobj));
		
		counting.start();
	}

}

class CountJob implements Runnable{
	Count countobj;
	public CountJob(Count countobj) {
		this.countobj =  countobj;
	}
	public void run() {
		countobj.printNumbers();
	}
}

class Count{
	public void printNumbers() {
		int k = 1;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(k+" ");
				k++;
				try {
				Thread.sleep(1000);
				}catch(Exception ex) {}
			}
			System.out.println("\n10 Numbers Succussfully Printed\n");
		}
	}
}