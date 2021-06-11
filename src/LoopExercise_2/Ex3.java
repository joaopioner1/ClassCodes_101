package LoopExercise_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 11/06/2021
		Scanner sc = new Scanner(System.in);

		List<Double> list = new ArrayList<>();

		Double[] array = new Double[20];
		Integer i = 0;
		try {
			do {
				System.out.print("ENTER NUMBER #" + i + ": ");
				array[i] = sc.nextDouble();
				if (array[i] < 0) {
					list.add(array[i]);
				}
				i++;
			} while (i < array.length);
			
			System.out.println("NEGATIVE NUMBERS:");
			for (Double count : list) {
				System.out.println(count);
			}

		} 
		catch (InputMismatchException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		sc.close();
	}
}
