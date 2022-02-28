package day11;

import java.util.Scanner;

public class accountTest {
	public static void main(String ar[])
	{
		Account ac = new Account();
		ac.read_input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to debit");
		float amt = sc.nextFloat();
		ac.debit(amt, "abc");
	}

}
