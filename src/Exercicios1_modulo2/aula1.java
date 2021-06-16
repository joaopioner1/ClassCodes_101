package Exercicios1_modulo2;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 16/02/21

		Scanner input = new Scanner(System.in);

		double peso, nota; // Variáveis
		int idade, ano;

		System.out.println("Insira sua idade: "); // Recebendo informações
		idade = input.nextInt();
		System.out.println("Insira sua nota: ");
		nota = input.nextDouble();
		System.out.println("Insira o ano que você está: ");
		ano = input.nextInt();
		System.out.println("Insira seu peso: ");
		peso = input.nextDouble();

		if (nota >= 7) { // Condições
			System.out.println("Nota maior que 7.");
		} else {
			System.out.println("Nota menor que 7.");
		}
		if (idade >= 16) {
			System.out.println("Você PODE votar no Brasil.");
		} else {
			System.out.println("Você NÂO pode votar no Brasil.\nVocê tem menos que 16 anos de idade.");
		}
		if (idade > 59) {
			System.out.println("Você possui mais de 59 anos de idade. Considerado idoso.");
		}
		if (ano != 1889) {
			System.out.println("Não é o ano da proclamação da república.");
		}
		if (ano == 2021) {
			System.out.println("2021. Você está no mesmo ano que este programa foi feito.");
		}
		if (ano == 2006) {
			System.out.println("2006. Nesse ano o Internacional foi campeão do mundo.");
		}
		if (peso != 70) {
			System.out.println("Não pesa 70 kilogramas.");
		}
		
		input.close(); 
	}
}