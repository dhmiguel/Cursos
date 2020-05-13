package application_HP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_HP.ImportedProduct_HP;
import entities_HP.Product_HP;
import entities_HP.UsedProduct_HP;

public class Program_HP {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		
		//Locale não funcionou no padrão US 
		
		//Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product_HP> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i<=n; i++) {
			System.out.printf("Product #%d data: \n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char res = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			if(res == 'i') {
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct_HP(name, price, customsFee));
			}
			else if (res == 'u') {
				System.out.println("Manufacture date: ");
				Date manufactureDate = sdf1.parse(sc.next());
				list.add(new UsedProduct_HP(name, price, manufactureDate));
			}
			else {
				list.add(new Product_HP(name, price));
			}
			
			
		}
		System.out.println();
		for(Product_HP p : list) {
			System.out.println(p.priceTag());
		}
	
		sc.close();
	}
	
}
