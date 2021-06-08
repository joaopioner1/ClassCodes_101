package exercicios3_modulo2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 23/02/2021
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a nota 1: ");
		float nota1 = input.nextFloat();
		System.out.print("Insira a nota 2: ");
		float nota2 = input.nextFloat();
		System.out.print("Insira a nota 3: ");
		float nota3 = input.nextFloat();
		
		double avg = (nota1 + nota2 + nota3) / 3;
		
		if (avg >= 7) {
			System.out.printf("Aluno APROVADO, PARABÉNS! Média: %.2f", avg);
		} else if (avg < 7 && avg >= 3) {
			System.out.printf("Aluno em RECUPERAÇÃO! Média: %.2f", avg);
		} else {
			System.out.printf("Aluno REPROVADO, QUE TRISTEZA! Média: %.2f", avg);
		}
		
		input.close();
	}

}
