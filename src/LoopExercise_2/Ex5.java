package LoopExercise_2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 11/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer answer = 0;
		do {
			System.out.print("Você deseja comprar um produto (1-sim, 2-nao)? ");
			answer = sc.nextInt();
			System.out.print("Você deseja ver a lista de produtos? ");
			answer = sc.nextInt();
			if (answer == 1) {
				System.out.println(showList());
			} 
			System.out.print("Insira o código do produto: ");
			
			
		} while (answer != 2);
		
		
		sc.close();
	}
	
	public static String showList() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCódigo: 123 | Nome: Balas | Preço: R$ 0,20\n");
		sb.append("Código: 124 | Nome: Barra de chocolate | Preço: R$ 2,50\n");
		sb.append("Código: 125 | Nome: Chicletes | Preço: R$ 0,25\n");
		sb.append("Código: 126 | Nome: Fandangos | Preço: R$ 4,00\n");
		sb.append("Código: 127 | Nome: Cafezinho | Preço: R$ 3,00\n");
		sb.append("Código: 128 | Nome: Doritos | Preço: R$ 4,50\n");
		sb.append("Código: 129 | Nome: Água mineral | Preço: R$ 2,50\n");
		return sb.toString();

	}
}
