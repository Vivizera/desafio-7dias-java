package CamelCase;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// Escreva um programa Java para encontrar o valor máximo e mínimo de um array.
		Scanner leitura = new Scanner(System.in);
		
		int vetor[] = {0, 55, 2, 27, 45, 47, 9, 3, 245, 76, 35, 7, 4, 24, 56, 76, 6, 43};
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] < menor) {
				menor = vetor[i];
			}else if (vetor[i] > maior){
				maior = vetor[i];
			}
		}
		System.out.println("Maior numero: " +maior);
		System.out.println("Menor numero: " +menor);
	}

}
