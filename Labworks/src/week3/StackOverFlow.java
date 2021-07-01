package week3;

class StackOverFlow{
	
	public static void print(int num) {	
		try {
			if(num == 0)
				return;
			else
			{
				num +=1;
				print(num);
			}
		}catch(StackOverflowError e) {
			System.out.println("Exception StackOver Flow......");
		}
		}
		
	
	public static void main(String[] args) {
		StackOverFlow.print(1);
	}
}