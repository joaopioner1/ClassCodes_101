package aula2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first grade: ");
		double n1 = in.nextDouble();
		System.out.print("Enter the second grade: ");
		double n2 = in.nextDouble();

		double avg = (n1 + n2) / 2;

		System.out.printf("Average: %.2f", avg);
		
		in.close();
	}

}
/*
 * Faça um programa capaz de obter duas notas de um aluno. Calcule a média das
 * notas. Mostre o resultado da média na tela do computador. 
 */