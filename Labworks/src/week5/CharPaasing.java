package week5;

import java.util.Scanner;

/*
 *  Write a class that keeps a running total of all characters passed to it (one at a time)
 *  and throws an exception if it passes a non-alphabetic character.
 */
public class CharPaasing {

	public static void main(String[] args) {
		Character charobj=new Character();
		
		Thread check = new Thread(new PassingJob(charobj));
		check.start();	
	}

}

class PassingJob implements Runnable{
	Character charobj;
	public PassingJob(Character charobj) {
		this.charobj = charobj;
	}
	public void run() {
		try {
			charobj.getChar();
		}catch(Exception ex) {
			System.out.println("Exception: You Are Entered on-alphabetic character");
		}		
	}
}

class Character{
	Scanner scan = new Scanner(System.in);
	public void getChar()throws Exception {
		while(true){
			System.out.println("Enter a Character:");			
			char c = scan.next().charAt(0);
			if(!(((c>='A') && (c<='Z')) || ((c>='a') && (c<='z')))) {
				throw new Exception();
			}			
		}
	}
}