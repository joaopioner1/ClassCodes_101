package exerciciosSwitch_modulo2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 08/03/21

		Scanner input = new Scanner(System.in);

		System.out.println("Produtos e seus respectivos códigos e preços:"
				+ "\nBalas: 123 (R$ 0,20 por unidade)\nBarra de chocolate: 124 (R$ 2,50 por unidade)"
				+ "\nChicletes: 125 (R$ 0,25 por unidade)");

		System.out.print("\nInsira o código do produto que deseja comprar: ");
		int code = input.nextInt();
		System.out.print("Insira a quantidade que deseja comprar: ");
		int quantity = input.nextInt();

		switch (code) {
		case 123:
			System.out.printf("\nCompra de bala(s) efetuada! Quantidade: " + quantity + " | Valor: R$ %.2f", (quantity * 0.20));
			break;
		case 124:
			System.out.printf("\nCompra de barra(s) de chocolate efetuada! Quantidade: " + quantity + " | Valor: R$ %.2f", (quantity * 2.50));
			break;
		case 125:
			System.out.printf("\nCompra de chiclete(s) efetuada! Quantidade: " + quantity + " Z Valor: R$ %.2f", (quantity * 0.25));
			break;
		default:
			System.out.println("Desculpe! Não foi possível encontrar o produto de acordo com este código.");
			break;
		}
		input.close();
	}
}
