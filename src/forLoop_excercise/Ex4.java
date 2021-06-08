package forLoop_excercise;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 08/06/2021 14:45
		Scanner sc = new Scanner(System.in);
		
		Double[] numbers = new Double[20];
		Double nmb = 0.0;
		try {
			for (int i = 0; i < numbers.length; i++) {
				System.out.print("Enter number # "+(i+1)+": ");
				numbers[i] = sc.nextDouble();
				 nmb += numbers[i];
				}
			}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		System.out.println("\n-----------------");
		System.out.println("SUM: " + String.format("%.2f", nmb));
		
		sc.close();
	}

}
//4. Faça um programa em java que leia 20 números e imprima a soma deles.
