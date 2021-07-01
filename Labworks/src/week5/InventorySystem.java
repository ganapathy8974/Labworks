package week5;
/*
 * Write a program to implement inventory System in which two threads called 
 * Producer will add one product in the Inventory and other thread Consumer will 
 * consume product from inventory. Thread should communicate in such a way
 * that, there should be maximum one product and minimum zero products in the inventory.
 * -------------------------------------------------------------------------------------
 * One Thread + One Object + Two Process
 */
public class InventorySystem {

	public static void main(String[] args) {
		Shop shopobj = new Shop();
		
		Thread Barath = new Thread(new ShopingJob(shopobj),"customer");
		Thread Company = new Thread(new ShopingJob(shopobj),"producer");
		Barath.start();
		Company.start();
	}

}

class ShopingJob implements Runnable{
	Shop shop;
	public ShopingJob(Shop shop) {
		this.shop = shop;
	}
	@Override
	public void run() {		
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("customer")) {
			shop.consume();	
		}else if(name.equals("producer")){
			shop.produce();	
		}	
	}
}

class Shop{
	boolean flag;
	synchronized public void produce(){
		for(int i=0;i<5;i++) {
			if(flag) {
				try {wait();}catch(Exception ex) {}
			}		
			System.out.println("Product Ready....Now Customer Can Buy the Product");
			flag=true;
			notify();
		}
		
	}
	
	synchronized public void consume() {
		for(int i=0;i<5;i++) {
			if(!flag) {
				try {wait();}catch(Exception ex) {}			
			}		
			System.out.println("Customer Buyed.......");
			flag=false;
			notify();
		}		
	}
}