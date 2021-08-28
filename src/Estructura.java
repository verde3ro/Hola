public class Estructura {
	public static void main(String[] args) {
		// Declaración de variables
		int i = 0;
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		String[] arr2 = new String[] { "Raúl", "Alejandro", "Verde", "Martínez" };
		int[] arr3 = new int[10];

		arr3[0] = 11;
		// Estructura if
		if (i == 1) {
			String cadena = "Hola";
			System.out.println("La variable i = 1");
			System.out.println(String.format("Cadena = %s", cadena));
		} else if (i == 2) {
			System.out.println("La variable i = 2");
		} else {
			System.out.println("La variable no es 1 ni 2");
		}

		// Estructura
		switch (i) {
		case 1:
			System.out.println("La variable i = 1");
			break;
		case 2:
			System.out.println("La variable i = 1");
			break;
		case 3:
			System.out.println("La variable i = 1");
			break;
		case 4 | 5 | 6:
			System.out.println("La variable i = 1");
			break;
		default:
			System.out.println("La variable no es 1 ni 2 ni 3");
			break;
		}

		System.out.println("i = " + i);

		// Estructura for
		for (int j = 0; j < arr.length; j++) {
			System.out.println(j + " es igual :: " + arr[j]);
		}

		// for como foreach
		for (int value : arr) {
			System.out.println("Value :: " + value);
		}

		for (String value : arr2) {
			System.out.println("Value :: " + value);
		}

		for (int value : arr3) {
			System.out.println("Value :: " + value);
		}
	}
}
