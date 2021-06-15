package LoopExercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 14/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer q_xuxus=0, q_abacates=0, q_banana=0, q_morangos=0;
		Integer answer = 0, i = 0;
		
		Double[] prices = new Double[4];
		Double valueProduct = 0.0;
		System.out.println(showInfo());
		do {
			System.out.print("\nInsira um código (0,1,2,3): ");
			answer = sc.nextInt();
			verfCode(answer);
			if (answer == 0) {
				System.out.println("GOODBYE!");
			}
			else if (answer == 1) {
				System.out.print("\nInsira o código do produto: ");
				Integer productCode = sc.nextInt();
				switch (productCode) {
				case 101 :
					System.out.print("BANANA! Quantidade do produto: ");
					q_banana = sc.nextInt();
					valueProduct = q_banana * 0.20;
					prices[i] = valueProduct;
					q_banana += q_banana;
					break;
				case 201 :
					System.out.print("XUXU! Quantidade do produto: ");
					q_xuxus = sc.nextInt();
					valueProduct = q_xuxus * 0.50;
					prices[i] = valueProduct;
					q_xuxus += q_xuxus;
					break;
				case 301 :
					System.out.print("ABACATE! Quantidade do produto: ");
					q_abacates = sc.nextInt();
					valueProduct = q_abacates * 1.50;
					prices[i] = valueProduct;
					q_abacates += q_abacates;
					break;
				case 401 :
					System.out.print("MORANGO! Quantidade do produto: ");
					q_morangos = sc.nextInt();
					valueProduct = q_morangos * 0.15;
					prices[i] = valueProduct;
					q_morangos += q_morangos;
					break;
					}
				}
		
			else if (answer == 2) {
				System.out.println("\nQuantidade de bananas vendidas : " + q_banana);
				System.out.println("Quantidade de xuxus vendidos: " + q_xuxus);
				System.out.println("Quantidade de abacates vendidos: " + q_abacates);
				System.out.println("Quantidade de morangos vendidos   : " + q_morangos);
			}
			else if (answer == 3) {
				System.out.printf("\nTotal R$ de bananas vendidas : %.2f", prices[i]);
				System.out.printf("\nTotal R$ de xuxus vendidos: %.2f", prices[i]);
				System.out.printf("\nTotal R$ de abacates vendidos: %.2f", prices[i]);
				System.out.printf("\nTotal R$ de morangos vendidos   : %.2f", prices[i]);
				System.out.printf("\nTotal R$ de produtos vendindos: %.2f", valueProduct);
			}
			i++;
		} while (answer != 0);
		
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
		sb.append("\nMorango  - 401 | UNI R$ 0.15");
		return sb.toString();
	}
	
	static void verfCode(Integer code) {
		if (code != 0 && code != 1 && code != 2 && code != 3) {
			throw new InvalidNumberEntered("Voce precisa digitar inicialmente os codigos 0, 1, 2 ou 3");
		}
	}
}
