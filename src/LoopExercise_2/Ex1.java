package LoopExercise_2;

public class Ex1 {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 11/06/2021
		try {
			Integer i = 0;
			while (i < 500) {
				i++;
				System.out.println(i);
			}
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
