package arraysEx;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 09/07/2021
		Scanner in = new Scanner(System.in);
		
		Double[] array1 = new Double[10];
		Double[] array2 = new Double[array1.length];
		Double[] array3 = new Double[array1.length];

		
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Insira valor array 1: ");
			array1[i] = in.nextDouble();
			System.out.print("Insira valor array 2: ");
			array2[i] = in.nextDouble();
		}
 		System.out.println("--------Result mul--------");
		for (int j = 0; j < array1.length; j++) {
			array3[j] = array1[j] * array2[j];
			System.out.println(array3[j]);
		}
		
		in.close();
	}

}

/*
screva um programa em JAVA que leia dois 
arrays de 10 posições e faça a multiplicação 
dos elementos de 
mesmo índice, colocando o resultado em um terceiro array. 
Mostre o array resultante

*/