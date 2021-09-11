import java.util.Arrays;

public class Arreglo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		String[] nombres = { "Raúl", "Alejandro", "Verde", "Martínez" };

		for (int valor : arr) {
			System.out.println(String.format("Valor %d", valor));
		}

		for (String valor : nombres) {
			System.out.println(String.format("Valor %s", valor));
		}

		// Redimencionar arreglos
		String[] nombres2 = Arrays.copyOf(nombres, nombres.length + 2);
		nombres2[nombres.length] = "verde3ro";
		nombres2[nombres.length + 1] = "green";

		for (String valor : nombres2) {
			System.out.println(String.format("Valor %s", valor));
		}

		// Matrices
		// int matriz1[] [] = new int[] []{}
		// int matriz2[] [] = new int[3] [3];
		int matriz3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3[i].length; j++) {
				System.out.println(String.format("Valor %d", matriz3[i][j]));
			}
		}

		System.out.println("*** Jagged Array **");
		// Matriz iregular o dentada
		int matriz4[][] = { { 3, 4, 5 }, { 77, 50 } };

		for (int[] elemento : matriz4) {
			for (int valor : elemento) {
				System.out.println(String.format("Valor %d", valor));
			}
		}

		System.out.println("*** Object Array **");
		Object[] c = { "Hola", 's', 40L };
		var y = 21;
		for (Object elemento : c) {
			System.out.println("Valor ::" + elemento);
		}
	}

	// se agrega comentario verde3ro

	// Se agrega comentario Vic
	
}
