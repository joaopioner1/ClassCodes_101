package forLoop_excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 08/06/2021 15:34
		Scanner sc = new Scanner(System.in);
		
		List<Double> list = new ArrayList<Double>();
		Double[] number = new Double[20];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Enter number #"+(1+i)+": ");
			number[i] = sc.nextDouble();
			if (number[i] < 0) {
				list.add(number[i]);
			}
		}
		System.out.println("--------\nNEGATIVE NUMBERS:");
		for (Double d : list) {
			System.out.println(d);
		}
		sc.close();
	}

}
