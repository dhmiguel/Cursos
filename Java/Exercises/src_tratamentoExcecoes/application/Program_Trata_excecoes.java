package application;

import java.util.Locale;
import java.util.Scanner;


import DomainException.Exception_TE;
import entities.Account;

public class Program_Trata_excecoes {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, limit);
			
		
			System.out.println();
			System.out.println("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			try {
				acc.withdraw(amount);
				System.out.println(acc);
			}
			catch (Exception_TE e) {
				System.out.println("Withdraw error: " + e.getMessage());
			}
			catch (RuntimeException e) {
				System.out.println("Unexpected error!");
			}
					
		sc.close();

	}

}
