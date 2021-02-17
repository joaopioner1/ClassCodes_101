package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o ano que você nasceu: ");
		int anoNasc = input.nextInt();
		
		if (anoNasc <= 2005) {
			System.out.println("Você pode votar neste ano (2021).\nIdade: " + (anoNasc - 2021));
		} else { 
			System.out.println("Você NÃO poderá votar neste ano (2021).\nIdade: " + (2021 - anoNasc));
		}
		
		input.close();
	}
}
