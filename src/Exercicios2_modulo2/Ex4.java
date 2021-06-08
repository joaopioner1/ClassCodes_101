package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		double n1 = input.nextDouble();
		System.out.print("Insira outro número: ");
		double n2 = input.nextDouble();
		
		if (n1 != n2) {
			if (n1 > n2) {
				System.out.println("O número " + n1 + " (primeiro nº) é o maior.");
			} else {
				System.out.println("O número " + n2 + " (segundo nº) é o maior.");
			}
		} else {
			System.out.println("Os números são iguais.");
		}
		
		input.close();
	}
}
