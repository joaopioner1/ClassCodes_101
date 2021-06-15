package LoopExercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 14/06/2021
		Scanner sc = new Scanner(System.in);
		
		List<Double> listValue = new ArrayList<>();
		List<Integer> listQuantity = new ArrayList<>();
		
		Integer answer = 0, quantityProduct = 0;
		
		Double valueProduct = 0.0;
		System.out.println(showInfo());
		do {
			System.out.print("\nInsira um código: ");
			answer = sc.nextInt();
			verfCode(answer);
			switch (answer) {
			case 0 :
				System.out.println("GOODBYE!");
				break;
			case 1 : 
				System.out.print("\nInsira o código do produto: ");
				Integer productCode = sc.nextInt();
				switch (productCode) {
				case 101 :
					System.out.println("BANANA! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 0.20;
					q_banana += quantityProduct;
					listValue.add(0, valueProduct);
					break;
				case 201 :
					System.out.println("XUXU! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 0.50;
					q_xuxu += quantityProduct;
					listValue.add(1, valueProduct);
					
					break;
				case 301 :
					System.out.println("ABACATE! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 1.50;
					q_abacate += quantityProduct;
					listValue.add(2, valueProduct);

					break;
				case 401 :
					System.out.println("MORANGO! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 0.15;
					listValue.add(3, valueProduct);
					
					break;
				}
			case 3 :
				System.out.println("Quantidade de bananas vendidas : " + q_banana);
				System.out.println("Quantidade de abacates vendidos: " + q_abacate);
				System.out.println("Quantidade de morangos vendidos: " + q_morango);
				System.out.println("Quantidade de xuxus vendidos   : " + q_xuxu);
				System.out.println("\nQuantidade total de produtos vendindos: " + quantityProduct);
				break;
			case 4 :
				System.out.println("Total R$ de bananas vendidas : " + q_banana);
				System.out.println("Total R$ de abacates vendidos: " + q_abacate);
				System.out.println("Total R$ de morangos vendidos: " + q_morango);
				System.out.println("Total R$ de xuxus vendidos   : " + q_xuxu);
				System.out.println("\nQuantidade total de produtos vendindos: " + quantityProduct);
				break;
			}
		} 
		while (answer != 0);
		
		sc.close();
	}
	
	static String showInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("#MENU#");
		sb.append("\n0 - sair");
		sb.append("\n1 - vender produto");
		sb.append("\n2 - Quantidade vendido no dia por produto em REAIS");
		sb.append("\n3 - Quantidade vendido no dia por produto em UNIDADES");
		sb.append("\n\n---CODIGOS DOS PRODUTOS---");
		sb.append("\nBanana   - 101 | UNI R$ 0.20");
		sb.append("\nXuxu     - 201 | UNI R$ 0.50");
		sb.append("\nAbacate  - 301 | UNI R$ 1.50");
		sb.append("\nTMorango - 401 | UNI R$ 0.15");
		return sb.toString();
	}
	
	static void verfCode(Integer code) {
		if (code != 0 && code != 1 && code != 2 && code != 3) {
			throw new InvalidNumberEntered("Voce precisa digitar inicialmente os codigos 0, 1, 2 ou 3");
		}
	}
}
