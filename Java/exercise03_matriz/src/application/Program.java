package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre o número de linhas da matriz: ");
		Integer m = sc.nextInt();
		sc.nextLine();
		System.out.println("Entre o número de colunas da matriz: ");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		Integer[][] mat = new Integer [m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entre com um número que esteja na matriz: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j<n; j++) {
				if(mat[i][j] == num) {
					System.out.println("Position: " + i + ", " + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);	
					}
					
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if(i < mat.length -1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();

	}

}
