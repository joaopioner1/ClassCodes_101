package aula2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);
		
		double point1, point2, avgCar, distance;
		
		System.out.print("Enter your inicial point: ");
		point1 = in.nextDouble();
		System.out.print("Enter your final point: ");
		point2 = in.nextDouble();
		System.out.print("Enter the average car consumption: ");
		avgCar = in.nextDouble();
		
		if (point2 >= point1) {
			distance = point2 - point1;
			distance /= avgCar;
		} else {
			distance = point1 - point2;
			distance /= avgCar;
		}
		
		System.out.printf("\nYou spent: R$ %.2f", (distance * 4.20));
				
		in.close();
	}

}
/*
 * Faça um programa capaz de ler a distância de uma cidade a outra, bem como o
 * consumo médio de combustível de um carro. Calcule o custo total da viagem
 * considerando que o preço do litro da gasolina é R$ 4,20. Mostre o custo na
 * tela do computador.
 */