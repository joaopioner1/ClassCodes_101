package arraysEx;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 09/07/2021
		Scanner in = new Scanner(System.in);
		
		Double[] array = new Double[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("INSIRA O PRECO DO PRODUTO: ");
			array[i] = in.nextDouble();
		}
		System.out.println("#-#-#-#-#-#-#-3-#-#");
		for (int j = 0; j < array.length; j++) {
			System.out.println("Valor R$ " + array[j] + " na posicao " + j);
		}
		
		char resp;
		do {
			System.out.println("Insira um indice: ");
			int indice = in.nextInt();
			System.out.println("Insira quantidade de produtos: ");
			int quantidade = in.nextInt();
			
			double preco = array[indice] * quantidade;
			System.out.printf("Valor total R$ %.2f", preco);
			
			System.out.print("\nQUER CONTINUAR COMPRANDO(s/n): ");
			resp = in.next().charAt(0);
		} while (resp != 'n');
		
		in.close();
	}
}
/*
Faça um programa na linguagem JAVA com um array para armazenar o preço de 10 produtos. Peça para o 
usuário digitar o preço desses 10 produtos, armazene esses valores no array criado. Posteriormente mostre o 
índice e preço do produto lado a lado. Peça ao usuário que escolha um índice. Depois pergunte qual a 
quantidade desse produto o usuário deseja comprar. Então mostre o valor total a ser cobrado desse produto. 
Ao final, pergunte ao usuário se ele deseja comprar mais um produto (1 para SIM e 0 para NÃO). Caso ele 
queira comprar, repita o processo de venda do produto
*/