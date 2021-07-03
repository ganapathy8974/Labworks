package week5;

public class Tax {
/*
 * Sales tax in the city is 5.25%. Write a program that accepts a price on the command line and prints out the appropriate tax and total purchase price.
 * (After proper conversion from string to double).
 */
	public static void main(String[] args) {		
		double price = Double.parseDouble(args[0]);
		Bill billobj = new Bill();
		
		Thread bill = new Thread(new BillingJob(billobj, price));
		bill.start();
	}

}
class BillingJob implements Runnable{
	Bill billobj; double price;
	public BillingJob(Bill billobj, double price) {
		this.billobj = billobj;
		this.price = price;
	}
	public void run() {
		billobj.getBill(price);
	}
}

class Bill{
	double tax = 5.25, total_amount, tax_amount;
	public void getBill(double price) {
		tax_amount = (price*tax)/100;
		total_amount = price + tax_amount;
		System.out.println("Total Tax of Purchesh = Rs."+tax_amount);
		System.out.println("Total Amount of Purchesh = Rs."+total_amount);
	}
}