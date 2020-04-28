package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Employee #%d\n", i);
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id not exist!");
		}
		else {
		System.out.println("Enter the percentage: ");
		Double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees");
		
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
