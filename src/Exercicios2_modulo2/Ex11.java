package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n = input.nextInt();
		
		if (n % 2 == 0) {
			System.out.println( n + " é par.");
		} else {
			System.out.println(n + " é ímpar.");
		}
		
		input.close();
	}
}
