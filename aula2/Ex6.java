package aula2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);
		
		double price;
		int quant;
		
		System.out.print("Enter the soda price: ");
		price = in.nextDouble();
		System.out.print("Enter the quantity of soda: ");
		quant = in.nextInt();
		
		double totalToPay = price * quant;
		
		System.out.printf("The total price is: R$ %.2f", totalToPay);
		
		in.close();
	}

}
/*
 * Faça um programa que obtenha o preço de uma latinha de refrigerante, a
 * quantidade de latinhas que o usuário quer comprar desse refrigerante. Calcule
 * o valor total a ser cobrado do usuário, ou seja, multiplique o preço pela
 * quantidade. Ao final, mostre o resultado na tela.
 */