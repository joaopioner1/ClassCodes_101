package aula2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter one number: ");
		int number = in.nextInt();

		System.out.printf("Number entered: %d\nThe two numbers after that are: %d and %d", number, (number + 1), (number + 2));

		in.close();
	}

}
/*
 * 4. Faça um programa capaz de obter um número inteiro do usuário. Calcule os
 * próximos dois números que sucedem ao valor digitado pelo usuário. Mostre-os
 * na tela do computador. Por exemplo, se o usuário digitou o valor 12, o seu
 * programa deverá exibir os números 13 e 14.
 */