package forLoop_excercise;

public class Ex1 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 08/06/2021 14:19
		try {
			for (int i = 1; i <= 5000; i++) {
				System.out.println(i);
			}
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
}
//1. Faça um programa em java que imprime na tela em sequência todos os números de 1 a 5000.
