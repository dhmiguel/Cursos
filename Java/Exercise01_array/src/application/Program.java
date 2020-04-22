package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Rent[] vect = new Rent[10];
		
		for(int i = 0 ; i < n; i++) {
			System.out.printf("#Rent %d\n", i);
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Rent(name, email);
			
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i<10; i++) {
			if(vect[i] !=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
