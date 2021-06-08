package forLoop_excercise;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 08/06/2021 15:25
		Scanner in = new Scanner(System.in);
		
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("5 x " + i + " = " + (i*5));
			}
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		in.close();
	}

}
//5. Faça um programa em java que imprima na tela a tabuada da 5.
