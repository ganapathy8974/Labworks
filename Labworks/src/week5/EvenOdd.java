package week5;
/*
 * Write a program which will create two threads one to display even and other to display odd numbers from 1 to 100.
 */
public class EvenOdd {

	public static void main(String[] args) {
				EvenOddNumber eon =new EvenOddNumber();
				
				Thread even = new Thread(new PrintJob(eon),"Even");
				Thread odd = new Thread(new PrintJob(eon),"Odd");
				
				even.start();
				odd.start();
	}

}

class PrintJob implements Runnable{
	EvenOddNumber eon;
	public PrintJob(EvenOddNumber eon) {
		this.eon = eon;
	}
	public void run() {
		Thread t =Thread.currentThread();
		String name = t.getName();
		synchronized (eon) {
			if(name.equals("Even")) {
				eon.evenPrint();
			}else if(name.equals("Odd")) {
				eon.OddPrint();
			}	
			
		}		
	}
}

class EvenOddNumber{
	public void evenPrint() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even Number...."+i);
			}
		}
	}
	
	public void OddPrint() {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Odd Number......"+i);
			}
		}
	}
}