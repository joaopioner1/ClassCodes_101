package exerciciosSwitch_modulo2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 08/03/2021

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		double number1 = input.nextDouble();
		System.out.println("Insira o segundo número: ");
		double number2 = input.nextDouble();
		System.out.println("Insira a operação que deseja realizar (*, /, -, +): ");
		char operacao = input.next().charAt(0);

		switch (operacao) {
		case '*':
			System.out.printf("Resultado: " + number1 + " x " + number2 + " = %.2f", (number1 * number2));
			break;
		case '/':
			System.out.printf("Resultado: " + number1 + " / " + number2 + " = %.2f", (number1 / number2));
			break;
		case '-':
			System.out.printf("Resultado: " + number1 + " - " + number2 + " = %.2f", (number1 - number2));
			break;
		case '+':
			System.out.printf("Resultado: " + number1 + " + " + number2 + " = %.2f", (number1 + number2));
			break;
		default:
			System.out.println("Operador inválido.");
			break;
		}

		input.close();
	}
}
