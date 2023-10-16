package CamelCase;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		// Escreva um programa Java para encontrar o número de inteiros pares e ímpares
		// em uma determinada matriz de inteiros.
		Scanner leitura = new Scanner(System.in);
		
		int vetor[] = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite uma numero: ");
			String num = leitura.nextLine();
			
			int numero = Integer.valueOf(num);
			
			if(numero % 2 ==0) {
				System.out.println("Esse número é par");
			}else {
				System.out.println("Esse número é impar");
			}
		}
	}

}
