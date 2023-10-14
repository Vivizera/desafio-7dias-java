package CamelCase;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// 2. Escreva um programa Java para somar os valores de um array.
		Scanner leitura = new Scanner(System.in);
		
		int vetor[] = new int[2];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			String num = leitura.nextLine();
			
			int numero = Integer.valueOf(num);
			
			soma = soma + numero;
		}
        System.out.println("A soma dos numeros é: " +soma);
	}

}
