package exerciciosSwitch_modulo2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner | Date: 08/03/2021

		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a idade do nadador: ");
		short age = input.nextShort();
		
		switch (age) {
		case 5 : System.out.println("Categoria: Infantil A"); break;
		case 6 : System.out.println("Categoria: Infantil A"); break;
		case 7 : System.out.println("Categoria: Infantil A"); break;
		case 8 : System.out.println("Categoria: Infantil B"); break;
		case 9 : System.out.println("Categoria: Infantil B"); break;
		case 10 : System.out.println("Categoria: Infantil B"); break;
		case 11 : System.out.println("Categoria: Juvenil A"); break;
		case 12 : System.out.println("Categoria: Juvenil A"); break;
		case 13 : System.out.println("Categoria: Juvenil A"); break;
		case 14 : System.out.println("Categoria: Juvenil B"); break;
		case 15 : System.out.println("Categoria: Juvenil B"); break;
		case 16 : System.out.println("Categoria: Juvenil B"); break;
		case 17 : System.out.println("Categoria: Juvenil B"); break;
		default : System.out.println("Categoria: Adulta"); break;
		
		}
		
		input.close();
	}

}
