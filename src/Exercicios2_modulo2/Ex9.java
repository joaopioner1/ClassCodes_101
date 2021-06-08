package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a senha: ");
		int senha = input.nextInt();
		
		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO. É FEIO BISBILHOTAR COISAS ALHEIAS.");
		}
		
		input.close();
	}

}
