package day11;

import java.util.Scanner;

public class Account {
	float balance;
	String name;
	void debit(float amount, String name)
	{
		if(balance>=amount)
		{
			System.out.println(amount+ "Successfully debited from the account of"+name);
			System.out.println("Remaining balance in the account is: "+(balance-amount));
		}
		else 
		{
			System.out.println("The amount cannot be debited due to insufficient funds.");
		}
		
	}
	void read_input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account name: ");
		name = sc.nextLine();
		System.out.println("Enter the balance: ");
		balance = sc.nextFloat();
		
	}

}
