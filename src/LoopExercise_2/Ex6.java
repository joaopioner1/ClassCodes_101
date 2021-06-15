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
					listValue.add(0, valueProduct);
					listQuantity.add(0, quantityProduct);
					continue;
				case 201 :
					System.out.println("XUXU! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 0.50;
					listValue.add(1, valueProduct);
					listQuantity.add(1, quantityProduct);
					continue;
				case 301 :
					System.out.println("ABACATE! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 1.50;
					listValue.add(2, valueProduct);
					listQuantity.add(2, quantityProduct);
					continue;
				case 401 :
					System.out.println("MORANGO! Quantidade do produto: ");
					quantityProduct = sc.nextInt();
					valueProduct = quantityProduct * 0.15;
					listValue.add(3, valueProduct);
					listQuantity.add(3, quantityProduct);
					continue;
				}
			case 2 :
				System.out.println("\nQuantidade de bananas vendidas : " + listQuantity.get(0));
				System.out.println("Quantidade de xuxus vendidos: " + listQuantity.get(1));
				System.out.println("Quantidade de abacates vendidos: " + listQuantity.get(2));
				System.out.println("Quantidade de morangos vendidos   : " + listQuantity.get(3));
				System.out.println("\nQuantidade total de produtos vendindos: " + quantityProduct);
				break;
			case 3 :
				System.out.printf("\nTotal R$ de bananas vendidas : %.2f", listValue.get(0));
				System.out.println("Total R$ de xuxus vendidos: " + listValue.get(1));
				System.out.println("Total R$ de abacates vendidos: " + listValue.get(2));
				System.out.println("Total R$ de morangos vendidos   : " + listValue.get(3));
				System.out.println("\nTotal R$ de produtos vendindos: " + valueProduct);
				break;
			}
		} 
		while (answer != 0);
		
		sc.close();
	}
	
	static StringBuilder sb = new StringBuilder();
	
	static String showInfo() {
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
	
	static String showQuantity(List<Integer> list) {
		sb.append("testeeee");
		return sb.toString();
	}
}
