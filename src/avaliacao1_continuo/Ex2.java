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
			checkAnswer(answer);
			if (answer >= 0 && answer <= 17) {
				menor += 1;
			} else if (answer >= 18 && answer <= 59) {
				adulto += 1;
			} else {
				idoso += 1;
			}
		}
		System.out.println(showInfo(menor, adulto, idoso));
		
		sc.close();
	}
	
	static String showInfo(Integer menor, Integer adulto, Integer idoso) {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------");
		sb.append("\nQuantidade de menores: " + menor);
		sb.append("\nQuantidade de adultos: " + adulto);
		sb.append("\nQuantidade de idosos : " + idoso);
		return sb.toString();
	}
	
	static void checkAnswer(Integer age) {
		if (age > 122) {
			throw new InvalidAgeException("There is no human which is 122 years old");
		}
	}
}
