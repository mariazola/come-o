package exercicios;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] numero = new int[5];

		numero[3] = 15;

		System.out.println(numero[3]);

		for (int i = 0; i < 5; i++) {
			System.out.println(numero[i]);
		}

		// entrada de dados
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");
			numero[i] = leia.nextInt();
		}

		// Saída de dados
		for (int i = 0; i < 5; i++) {
			System.out.println(numero[i]);
		}
		
		String[] nome = {"Maria", "Zola", "Ana"}; // imicialização de um vetor 
		
		for(int i = 0; i<3; i++) {
			System.out.println(nome[i]);
		}
		leia.close();
	}

}
