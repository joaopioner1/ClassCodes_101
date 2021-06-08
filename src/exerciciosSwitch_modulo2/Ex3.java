package exerciciosSwitch_modulo2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 08/03/2021

		Scanner input = new Scanner(System.in);

		System.out.print("Insira sua altura: ");
		float height = input.nextFloat();
		System.out.print("Insira seu sexo (F/M): ");
		char sex = input.next().charAt(0);

		double idealWeight;

		switch (sex) {
		case 'F':
			idealWeight = (62.1 * height) - 44.7;
			System.out.printf("Seu peso ideal de acordo com sua altura e sexo eh: Kg %.2f", idealWeight);
			break;
		case 'M':
			idealWeight = (72.7 * height) - 58.0;
			System.out.printf("Seu peso ideal de acordo com sua altura e sexo eh: %.2f", idealWeight);
			break;
		}

		input.close();
	}
}
