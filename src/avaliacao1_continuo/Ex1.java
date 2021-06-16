package avaliacao1_continuo;

public class Ex1 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 16/06/2021
		try {
			for (int i = 1; i <= 300; i++) {
				System.out.println("Pasta " + i);
			}
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
