package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmployeeLambda;

public class ProgramLambda {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		
		System.out.println("Enter a full file path: ");
		String path = sc.nextLine();
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<EmployeeLambda> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new EmployeeLambda(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
				
			System.out.println("Enter a salary: ");
			Double inputSalary = sc.nextDouble();
			
			List<String> emails = list.stream().filter(e -> e.getSalary() > inputSalary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than 2000.00:");
			
			emails.forEach(System.out::println);
			
			double sum = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
