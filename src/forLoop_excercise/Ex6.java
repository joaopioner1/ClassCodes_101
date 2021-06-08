package forLoop_excercise;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 08/06/2021 15:04
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		Double number = sc.nextDouble();
		
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("\n"+number + " x " + i + " = " + (i * number));
			}
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		sc.close();
	}

}
//6. Faça um programa em java que imprima na tela a tabuada de um número lido.
