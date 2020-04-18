package aplication;

import java.util.Locale;
import java.util.Scanner;

import enitities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double amount;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		Account account = new Account(number,holder);		
		
		System.out.println("Is there an initial deposit (y/n)");
		char res = sc.next().charAt(0);
		
		
		if(res == 'y') {
			System.out.println("Enter initial deposit value: ");
			amount = sc.nextDouble();
			account.deposit(amount);
		}
		
		System.out.println("Account data:" + account);
		
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		amount = sc.nextDouble();
		
		account.deposit(amount);
		
		System.out.println("Updated Account data: " + account);
		
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		
		account.withdraw(amount);
		
		System.out.println("Updated Account data: " + account);
		
		
		
		
		sc.close();

	}

}
