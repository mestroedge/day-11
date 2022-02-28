package day11;
import java.util.*;
public class Stocks{

	String name;
	int num_stocks;
	float unitprice;
	void read_input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the share name:");
		name = sc.nextLine();
		System.out.println("Enter the number of shares:");
		num_stocks = sc.nextInt();
		System.out.println("Enter the share price:");
		unitprice = sc.nextFloat();
	}
	
	float share_value() {
		System.out.println(name+" stock value is: "+ (num_stocks*unitprice));
		return num_stocks*unitprice;
	}
	
}
