package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program_set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> set =  new HashSet<>();
		
		System.out.println("How many students for course A?");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n; i++) {
			int codigoA = sc.nextInt();
			sc.nextLine();
			 set.add(new Aluno(codigoA, 'A'));
		}
		
		System.out.println("How many students for course B?");
		n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n; i++) {
			int codigoA = sc.nextInt();
			sc.nextLine();
			set.add(new Aluno(codigoA, 'B'));
		}
		
		System.out.println("How many students for course C?");
		n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n; i++) {
			int codigoA = sc.nextInt();
			sc.nextLine();
			set.add(new Aluno(codigoA, 'C'));
		}
		
		System.out.println("Total Students: " + set.size());
		
		sc.close();

	}

}
