package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota do aluno: ");
		float nota1 = input.nextFloat();
		System.out.print("Insira a segunda nota do aluno: ");
		float nota2 = input.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO.\nMédia: " + media);
		} else if (media < 7 && media >= 3) {
			System.out.println("Aluno em EXAME. \nMédia: " + media);
		} else {
			System.out.println("Aluno REPROVADO. Dedique-se mais na próxima vez.\nMédia: " + media);
		}
		
		input.close();
	}

}
