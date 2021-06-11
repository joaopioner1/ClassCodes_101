package LoopExercise_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 11/06/2021
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER NUMBER: ");
		try {
			Integer number = sc.nextInt();

			Integer count = 0;
			while (count < 10) {
				count++;
				System.out.println(number+" x "+count+" = "+(number * count));
			}
		} 
		catch (InputMismatchException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		sc.close();
	}

}
