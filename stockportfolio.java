package day11;

import java.util.Scanner;

public class stockportfolio {
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stocks:");
		float tot_stocks = 0;
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
//			String ob_name = "stock"+Integer.toString(i);
			
			Stocks ob_name = new Stocks();
			ob_name.read_input();
			tot_stocks+=ob_name.share_value();
		}
		System.out.print("Total stocks values is : "+tot_stocks);
	}

}
