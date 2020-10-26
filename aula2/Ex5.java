package aula2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter one number: ");
		int number1 = in.nextInt();
		System.out.print("Enter one number: ");
		int number2 = in.nextInt();
		System.out.print("Enter one number: ");
		int number3 = in.nextInt();
		
		int sum = number1 + number2;
		int sub = number2 - number3;
		
		System.out.printf("Sum: %d\nSubtraction: %d", sum, sub);
		
		in.close();
	}

}
/*
 * Faça um programa capaz de obter três números inteiros do usuário. Então
 * calcule a soma do primeiro com o segundo e a subtração do segundo pelo
 * terceiro. Ao final, mostre os resultados na tela.
 */