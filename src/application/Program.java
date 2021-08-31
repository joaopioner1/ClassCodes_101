package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Autor: João Vitor Pioner & Vitor Sehn | Date: 31/08/2021
		Scanner scan = new Scanner(System.in);

		// No enunciado esta que todos os arrays sao numeros com virgulo, porem,
		// como quantidade de um produto eh um numero decimal?
		int[] quantidade = new int[6];
		double[] array_valorCobrado = new double[6];
		double[] array_preco = { 0.20, 0.30, 2.00, 5.00, 6.00, 10.00 };

		System.out.print("Para entrar na loja, digite 1: ");
		short resposta = scan.nextShort();

		while (resposta != 0 && resposta <= 3 && resposta > 0) {
			mostraMenuPrincipal();
			System.out.print("\nDigite o numero de acordo com seu desejo: ");
			resposta = scan.nextShort();

			if (resposta == 1) {
				mostraMenuVendas();
				System.out.println("\nOla, seja bem-vindo a nossa loja! O que você deseja comprar?");
				int code = scan.nextInt();
				switch (code) {
				case 0:
					System.out.println("BALAS! insira a quantidade: ");
					quantidade[0] = scan.nextInt();
					calculaValor(array_valorCobrado, array_preco, quantidade, 0);
					break;
				case 1:
					System.out.println("CHICLETES! insira a quantidade: ");
					quantidade[1] = scan.nextInt();
					calculaValor(array_valorCobrado, array_preco, quantidade, 1);
					break;
				case 2:
					System.out.println("CHOCOLATES! insira a quantidade: ");
					quantidade[2] = scan.nextInt();
					calculaValor(array_valorCobrado, array_preco, quantidade, 2);
					break;
				case 3:
					System.out.println("SUCO DE LARANJA! insira a quantidade: ");
					quantidade[3] = scan.nextInt();
					calculaValor(array_valorCobrado, array_preco, quantidade, 3);
					break;
				case 4:
					System.out.println("SUCO DE UVA! insira a quantidade: ");
					quantidade[4] = scan.nextInt();
					calculaValor(array_valorCobrado, array_preco, quantidade, 4);
					break;
				case 5:
					System.out.println("SANDUICHE! insira a quantidade: ");
					quantidade[5] = scan.nextInt();
					calculaValor(array_valorCobrado, array_preco, quantidade, 5);
					break;
				}
			} else if (resposta == 2) {
				mostraValores(array_valorCobrado);
			} else if (resposta == 3) {
				mostraQuantidades(quantidade);
			}
		}
		scan.close();

	}

	static void mostraQuantidades(int array[]) {
		System.out.printf("BALA:            %d\n", array[0]);
		System.out.printf("CHICLETES:       %d\n", array[1]);
		System.out.printf("CHOCOLATES:      %d\n", array[2]);
		System.out.printf("SUCO DE LARANJA: %d\n", array[3]);
		System.out.printf("SUCO DE UVA:     %d\n", array[4]);
		System.out.printf("SANDUICHE:       %d\n", array[5]);
	}

	static void mostraValores(double array[]) {
		System.out.printf("BALA:            R$ %.2f\n", array[0]);
		System.out.printf("CHICLETES:       R$ %.2f\n", array[1]);
		System.out.printf("CHOCOLATES:      R$ %.2f\n", array[2]);
		System.out.printf("SUCO DE LARANJA: R$ %.2f\n", array[3]);
		System.out.printf("SUCO DE UVA:     R$ %.2f\n", array[4]);
		System.out.printf("SANDUICHE:       R$ %.2f\n", array[5]);
	}

	static void calculaValor(double array_valorCobrado[], double array_preco[], int quantidade[], int index) {
		array_valorCobrado[index] = array_preco[index] * quantidade[index];
	}

	static void mostraMenuVendas() {
		System.out.println("\nCatalogo de produtos:");
		System.out.println(" 0 -      Balas        - Preço: R$ 0.20");
		System.out.println(" 1 -    Chicletes      - Preço: R$ 0.30");
		System.out.println(" 2 -    Chocolates     - Preço: R$ 2.00");
		System.out.println(" 3 -   Suco de laranja - Preço: R$ 5.00");
		System.out.println(" 4 -    Suco de uva    - Preço: R$ 6.00");
		System.out.println(" 5 -     Sanduíche     - Preço: R$ 10.00");
	}

	static void mostraMenuPrincipal() {
		System.out.println("\nMENU:");
		System.out.println("0 - Sair");
		System.out.println("1 - Vender produto");
		System.out.println("2 - Quantidade vendido no dia por produto em REAIS");
		System.out.println("3 - Quantidade vendido no dia por produto em UNIDADES");
	}
}
