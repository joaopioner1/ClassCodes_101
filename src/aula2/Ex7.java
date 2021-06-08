package aula2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);
		
		int quantHD, quantSD; // HD = hot dog | SD = soda 
		
		System.out.print("How many hot dogs do you want to buy? ");
		quantHD = in.nextInt();
		System.out.print("How many sodas do you want to buy? ");
		quantSD = in.nextInt();
		
		double priceHD = quantHD * 5.00;
		double priceSD = quantSD * 3.00;
		
		System.out.printf("\nTotal hot dog price: R$ %.2f", priceHD);
		System.out.printf("\nTotal soda price: R$ %.2f", priceSD);
		System.out.printf("\nTotal price: R$ %.2f", (priceHD + priceSD));
		in.close();
	}

}
/*
 * Uma lancheria vende cachorro quente e refrigerante aos seus clientes pelo
 * preço de R$ 5,00 e R$ 3,00, respectivamente. Faça um programa que obtenha a
 * quantidade de cachorros quentes e a quantidade de refrigerantes que o usuário
 * quer comprar. Calcule o preço a ser cobrado do usuário nessa venda. Ao final,
 * exiba o preço total na tela.
 */