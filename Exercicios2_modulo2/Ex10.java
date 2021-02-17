package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		char sexo;
		float altura; 
		double pesoIdeal;
		
		System.out.println("Insira seu sexo (F/M):");
		sexo = input.next().charAt(0);
		System.out.println("Insira sua altura (use . não ,):");
		altura = input.nextFloat();
		
		if (sexo == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.printf("\nSeu peso ideal é: %.2f", pesoIdeal);
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("\nSeu peso ideal é: %.2f", pesoIdeal);
		}
		
		input.close();
	}
}
