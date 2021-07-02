package week5;

public class ThreadAnlz {

	public static void main(String[] args) {
		Print print = new Print();
		Thread barath = new Thread(new ThreadJob(print));
		barath.start();
		barath.start();
		barath.start();
		barath.start();
	}

}
class ThreadJob implements Runnable{
	Print print;
	public ThreadJob(Print print) {
		this.print = print;
	}
	@Override
	public void run() {
		print.out();
		
	}
}

class Print{
	public void out() {
		System.out.println("I am Started..........");
	}
}

//While two time or more time trying to execute a Thread. Only one Thread is Running. 
//Other next Thread Automatically shows the error IllegalThreadStateException.