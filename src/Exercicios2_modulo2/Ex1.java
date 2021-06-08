package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valor = input.nextInt();
		
		if (valor > 0) {
			System.out.println("Valor positivo. Número digitado: " + valor);
		} else if (valor == 0) {
			System.out.println("Número neutro. Número digitado: " + valor);
		}
		else {
			System.out.println("Valor negativo. Número digitado: " + valor);
		}
		
		input.close();
	}

}
