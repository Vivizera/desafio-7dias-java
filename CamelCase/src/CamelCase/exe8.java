package CamelCase;

public class exe8 {

	public static void main(String[] args) {
		// Escreva um programa Java para encontrar valores duplicados em uma matriz de
		// valores inteiros.
		int vetor[] = {1, 2, 3, 4, 3, 2, 5, 6, 7, 7, 8, 10, 10, 8};

        System.out.println("Valores duplicados: ");
        valoresDuplcados(vetor);
    }

    public static void valoresDuplcados(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Os valores duplicados são: " + vetor[i]);
                }
            }
        }
    }
}
