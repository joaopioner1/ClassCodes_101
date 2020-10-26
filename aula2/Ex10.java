package aula2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);
		
		double kgBreads, kgCakes, kgCookie;
		
		System.out.print("Enter how many kg breads: ");
		kgBreads = in.nextDouble();
		System.out.print("Enter how many kg cakes: ");
		kgCakes = in.nextDouble();
		System.out.print("Enter how many kg cookies: ");
		kgCookie = in.nextDouble();
		
		double totalBreads = kgBreads * 10.00;
		double totalCakes = kgCakes * 25.00;
		double totalCookies = kgCookie * 15.00;
		
		double total = totalBreads + totalCakes + totalCookies;
		
		System.out.printf("You need to pay: R$ %.2f", total);
		
		in.close();
	}

}
/*
 * Uma padaria vende três produtos: cacetinhos, bolos e bolachas. Esses produtos
 * são vendidos com base no peso, ou seja, após pesado o produto, é calculado o
 * valor da venda. O preço de venda por KG de cada um desses produtos é
 * apresentado na tabela abaixo. Faça um programa que obtenha do usuário 3
 * pesos: peso dos cacetinhos, peso dos bolos, peso das bolachas. Então, calcule
 * o valor da venda de cada produto, ou seja, multiplique o preço (tabela
 * abaixo) por cada peso lido do usuário. Ao final, mostre o valor total a ser
 * cobrado do cliente com a compra dos 3 produtos.
 */