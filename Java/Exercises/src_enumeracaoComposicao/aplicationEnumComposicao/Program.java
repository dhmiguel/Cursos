package aplicationEnumComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enititiesEnumComposicao.Client;
import enititiesEnumComposicao.OrdemItem;
import enititiesEnumComposicao.Order;
import enititiesEnumComposicao.Product;
import enititiesEnumComposicao.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.println("Birth date: ");
		Date birthDate = sdf2.parse(sc.nextLine());
		
		System.out.println("Enter order Data: ");
		System.out.println("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter #" + i + " " + "item data: ");
			System.out.println("Product name: ");
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			
			OrdemItem item = new OrdemItem(quantity, price, new Product(productName, price));
			
			order.addItem(item);
		}
		
		
		System.out.println(order);
		
		
		
		
		
		sc.close();

	}

}
