package LoopExercise_2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 14/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer answer = 0, quantityProduct = 0;
		Integer q_banana, q_morango;
		
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
					break;
				}
			case 3 :
				
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
	
	static void verfCode (Integer code) {
		if (code != 0 && code != 1 && code != 2 && code != 3) {
			throw new InvalidNumberEntered("Voce precisa digitar inicialmente os codigos 0, 1, 2 ou 3");
		}
	}
}
