package CamelCase;

public class exe6 {

	public static void main(String[] args) {
		// Escreva um programa Java para copiar um array iterando o array.

		int privetor[] = {53, 6, 21, 85, 53};
		int vetor[] = {42,65,4,32,53};

		System.out.println("Primero vetor: " + privetor);

		for (int i = 0; i < privetor.length; i++) {
			vetor = privetor;
		}
		System.out.println("Novo vetor: " +vetor);
	}
}