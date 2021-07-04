package week5;

/*
 * Modify the above program to get number of prices, total them, find the sales tax and calculate the total amount.
 */

public class TaxMultiple {

	public static void main(String[] args) {
		Billing bill = new Billing();		
		double total_amount=0,price;
		for(String s : args) {
			price = Double.parseDouble(s);
			total_amount = total_amount + price;
		}
		Thread print = new Thread(new BillJob(bill, total_amount));
		print.start();
	}

}

class BillJob implements Runnable{
	Billing bill; double total_amount;
	public BillJob(Billing bill, double total_amount) {
		this.bill = bill;
		this.total_amount = total_amount;
	}
	@Override
	public void run() {		
		bill.getBill(total_amount);
	}
}
class Billing{
	double tax = 5.25,total_tax,bill_amount;
	public void getBill(double total_amount) {
		total_tax = (total_amount * tax) / 100;
		bill_amount = total_tax + total_amount ; 
		System.out.println("Total Purchesh Amount = Rs. "+total_amount);
		System.out.println("Total Tax of your Purcheshed Amount = Rs. "+total_tax);
		System.out.println("Total Bill Amount of Your Purchesh = Rs. "+bill_amount);
	}
}