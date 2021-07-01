package week5;

/*
 * Write a program to give synchronized access to multiple thread each with 
 * different message to display method which formats the message in the following manner.
 */

public class SyncMethod {

	public static void main(String[] args) {
		PrintMsg printobj = new PrintMsg();
		
		Thread one = new Thread(new PrintingJob(printobj),"one");
		Thread two = new Thread(new PrintingJob(printobj),"two");
		Thread three = new Thread(new PrintingJob(printobj),"three");
		
		one.start();		
		two.start();
		three.start();
		
	}

}

class PrintingJob implements Runnable{
	PrintMsg printobj;
	public PrintingJob(PrintMsg printobj) {
		this.printobj = printobj;
	}
	public void run() {			
		printobj.msgOne();
	}
}

class PrintMsg{
	synchronized public void msgOne(){
		Thread t = Thread.currentThread();
		String name =t.getName();
		System.out.println("[-----Message "+name+"----]");
	}	
	
}
