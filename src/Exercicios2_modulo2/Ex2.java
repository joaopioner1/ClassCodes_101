package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int numero = input.nextInt();
		
		if (numero <= 0) {
			System.out.println("Valor positivo: " + (numero * -1));
		} else {
			System.out.println("Valor positivo: " + numero);
		}
		
		input.close();
	}
}
