package avaliacao1_continuo;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 16/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer menor = 0, adulto = 0, idoso = 0;
		
		System.out.println("#PROGRAMA VERIFICA IDADES#");
		for (int i = 1; i <= 10; i++) {
			System.out.print("Insira a idade da pessoa "+i+": ");
			Integer answer = sc.nextInt();
			if (answer >= 0 && answer <= 17) {
				menor += 1;
			} else if (answer >= 18 && answer <= 59) {
				adulto += 1;
			} else {
				idoso += 1;
			}
		}
		
		
		sc.close();
	}

}
