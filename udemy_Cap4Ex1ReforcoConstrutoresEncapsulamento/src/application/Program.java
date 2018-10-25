package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: "); 
		int number =  sc.nextInt();
		
		System.out.print("Enter account holder: "); 
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? "); 	
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: "); 	
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, number,initialDeposit);
		}
		else {
			account = new Account(holder, number);	
		}
		
		
	
		System.out.println("");
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.println("");
		
		System.out.print("Enter a deposit value: "); 	
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		//account.setHolder("Maria");
		//System.out.println("New Name: "+account.getHolder());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("");
		
		System.out.print("Enter a withdraw value: "); 	
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
		
		
	}

}
