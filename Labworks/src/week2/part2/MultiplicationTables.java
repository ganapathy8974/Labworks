package week2.part2;

public class MultiplicationTables {

	public static void main(String[] args) {
		int ans = 0, row=0, column=0,size=12;
		do {			
			do {
				ans=row*column;
				System.out.print(ans+"\t");
				column++;
			}while(column<=size);
			System.out.println("");
			column=0;
			row++;
		}while(row<size);

	}

}
