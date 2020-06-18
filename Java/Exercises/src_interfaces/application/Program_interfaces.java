package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Contract;
import model.entites.Installment;
import model.service.ContractService;
import model.service.PaypalService;



public class Program_interfaces {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();
		
		Contract con = new Contract(number, date, totalValue);
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(con, months);
		
		System.out.println("Installments: ");
		
		for(Installment i : con.getIntallments()) {
			System.out.println(sdf.format(i.getDueDate()) + " - " + i.getAmount());
		}
		
		
		/*for(int i=0; i<months; i++) {
			System.out.println(con.getIntallments().get(i).getDueDate() + " - " + con.getIntallments().get(i).getAmount());
		}*/
		sc.close();
		
	}

}
