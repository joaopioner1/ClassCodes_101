package avaliacao;

import java.util.Scanner;

public class Avaliacao_Ex1 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 4/11/2020 16:14
		Scanner input = new Scanner(System.in);

		// Váriaveis
		int numero1, numero2, numero3; // Utilizadas para entrada de dados
		int calculo; // utilizada para fazer o calcúlo

		// Imprimindo mensagens e utilizando váriaveis
		System.out.println("-- PROGRAMA 1--\n");

		System.out.print("Insira o primeiro número: ");
		numero1 = input.nextInt();
		System.out.print("Insira o segundo número: ");
		numero2 = input.nextInt();
		System.out.print("Insira o terceiro número: ");
		numero3 = input.nextInt();

		calculo = numero1 * numero2 - numero3;

		System.out.println("Resultado: " + calculo); // Mostra mensagem final no console

		input.close();
	}

}
