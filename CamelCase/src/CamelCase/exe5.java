package CamelCase;

public class exe5 {

	public static void main(String[] args) {
		// Escreva um programa Java para imprimir a seguinte grade.
		int[][] v = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				v[i][j] = i;
				System.out.printf("%2d ", v[i][j]);
			}
			System.out.println();
		}
	}

}
