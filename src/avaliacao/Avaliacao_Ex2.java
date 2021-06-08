package avaliacao;

import java.util.Scanner;

public class Avaliacao_Ex2 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 4/11/2020 16:34
		Scanner input = new Scanner(System.in);

		// Váriaveis
		double numero1, numero2, numero3, numero4; // Utilizadas para entrada de dados
		double calculando; // utilizada para fazer o calcúlo

		// Imprimindo mensagens e utilizando váriaveis
		System.out.println("-- PROGRAMA 2--\n");

		System.out.print("Insira o primeiro número: ");
		numero1 = input.nextDouble();
		System.out.print("Insira o segundo número: ");
		numero2 = input.nextDouble();
		System.out.print("Insira o terceiro número: ");
		numero3 = input.nextDouble();
		System.out.print("Insira o quarto número: ");
		numero4 = input.nextDouble();
		
		calculando = numero1 + ((numero2 + 1) / (numero3 - numero4));
		
		System.out.printf("Resultado da operação: %.3f", calculando);
		
		input.close();
	}

}
