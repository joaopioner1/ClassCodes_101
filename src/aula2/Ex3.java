package aula2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter one number: ");
		int number = in.nextInt();
		
		System.out.printf("the number multiplied by itself: %.0f", Math.pow(number, 2));
		
		in.close();
	}

}
/*
 * 3. Faça um programa capaz de obter um número inteiro do usuário. Calcule o
 * quadrado deste número, ou seja, multiplique o número por ele mesmo. Ao final,
 * mostre o resultado na tela.
 */