package arraysEx;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 08/07/2021
		Scanner in = new Scanner(System.in);
		
		Integer[] A = new Integer[20];

		for (int i = 0; i < A.length; i++) {
			A[i] = 10;
			A[i] += 10 * i;
		}
		
		for (int j = 0; j < A.length; j++) {
			System.out.println(A[j]);
		}
		in.close();
	}

}

/*

Preencher um array A de 20 elementos (índices de 0 a 19) com os números inteiros 10,20,30,40,50,...,200. 
Escrever o array A após o seu total preenchimento. Observe que existe uma relação entre o índice e o valor 
armazenado na posição do array.

*/