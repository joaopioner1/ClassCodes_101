package LoopExercise_2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 14/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer answer = 0;
		System.out.println(showInfo());
		do {
			System.out.print("\nInsira um código: ");
			answer = sc.nextInt();
			verfCode(answer);
			switch (answer) {
			case 0 :
				
			
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
		sb.append("\nCelular -    101 | R$ 950.00");
		sb.append("\nTV -         201 | R$ 1800.00");
		sb.append("\nVideo Game - 301 | R$ 2500.00");
		sb.append("\nTablet -     401 | R$ 1200.00");
		return sb.toString();
	}
	
	static void verfCode (Integer code) {
		if (code != 0 && code != 1 && code != 2 && code != 3) {
			throw new InvalidNumberEntered("Voce precisa digitar inicialmente os codigos 0, 1, 2 ou 3");
		}
	}
}
