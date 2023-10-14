package CamelCase;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// Escreva um programa Java para calcular o valor médio dos elementos do array.

		Scanner leitura = new Scanner(System.in);

		int vetor[] = new int[3];

		double soma = 0;
		double media = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("DIgite um numero: ");
			String num = leitura.nextLine();

			double numero = Integer.valueOf(num);

			soma = soma + numero;
			media = soma / 3;

		}
		System.out.println("A média dos numeros é: " + media);
	}

}
