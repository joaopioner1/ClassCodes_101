package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de maças que foram vendidas: ");
		int quantity = input.nextInt();
		
		if (quantity < 12) {
			System.out.printf("O preço a pagar pelas maçãs é: R$ %.2f", (quantity * 0.30));
		} else {
			System.out.printf("O preço a pagar pelas maçãs é: R$ %.2f", (quantity * 0.25));
		}
		
		input.close();
	}

}
