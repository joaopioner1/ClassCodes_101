package LoopExercise_2;

public class Ex4 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 11/06/2021
		Integer count = 0;

		try {
			do {
				count++;
				System.out.println(count);
			} while (count < 500);
		} 
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

}
