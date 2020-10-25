package arrays_exercises;

import java.util.Scanner;

public class TesteGodinha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, soma, media;
		
		System.out.print("Digita a nota 1 do alunos: ");
		nota1 = in.nextDouble();
		System.out.print("Digita a nota 2 do alunos: ");
		nota2 = in.nextDouble();
		System.out.print("Digita a nota 3 do alunos: ");
		nota3 = in.nextDouble();
		System.out.print("Digita a nota 4 do alunos: ");
		nota4 = in.nextDouble();
		
		soma = nota1 + nota2 + nota3 + nota4;
		media = soma / 4;
		
		if (media >= 90) {
			System.out.println("\nSuper aluno. Voce eh foda\nSua media foi: " + media); 
		} 
		else if (media >= 80) {
			System.out.println("\nBom aluno\nSua media foi: " + media);
		} 
		else if (media >= 70) {
			System.out.println("\nAluno medio\nSua media foi: " + media);
		}
		else if (media >= 50) {
			System.out.println("\nAluno meio cagado. Tem direito a recuperacao\nSua media foi: " + media);
		}
		else {
			System.out.println("\nAluno bosta reprovou.\nSua media foi: " + media + " bostinha");
		}
		
		in.close();
	}

}
