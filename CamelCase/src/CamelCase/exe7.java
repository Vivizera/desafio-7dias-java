package CamelCase;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		// Escreva um programa Java para encontrar o índice de um elemento do array.

		int vetor[] ={10, 20, 30, 40, 50};
		int elementoProcurado=30;
        int indice = encontrarIndice(vetor, elementoProcurado);

		if(indice != -1){
			System.out.println("O elemento " + elementoProcurado + " foi encontrado no índice " + indice);
		}else{
			System.out.println("O elemento " + elementoProcurado + " não foi encontrado no array.");
		}
	}
    public static int encontrarIndice(int[] vetor, int elemento) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return i;
			}
		}
		return -1;
	}
}
