public class HolaMundo {

	public static void main(String[] args) {
		// Declaración variables
		// variables primitivas
		short s = 2; // Entero
		int i = 0; // Entero
		long l = 0L; // Entero
		float f = 0f; // Decimal
		double d = 0d; // Decimal
		char c = 'c'; // Caracteres
		byte[] b = new byte[] {}; // Bytes
		boolean flag = true; // Tipo booleano

		// variables objetos
		Short sh = 1;
		Integer iOb = Integer.valueOf(100);
		Integer in = 100; // no incializado valor nulo
		int aub = iOb;
		Long lo = 32L;
		Float fl = null;
		Double d0 = 0.00D;
		Character ch = 'c';
		Byte[] bt = new Byte[] {}; // Bytes
		Boolean flag2 = false;
		// String
		String cadena = "    Hola mundo";
		cadena += " green     ";

		// Validación con primitiva
		if (s == 2) {
			System.out.println("s es igual a 2");
		}

		// Validación con objeto
		if (!sh.equals(2)) {
			System.out.println("sh es diferente a 2");
		}

		if (cadena.equals("Hola")) {
			System.out.println("cadena es igual a hola");
		}

		if (cadena.contains("Hola")) {
			System.out.println("cadena si contine Hola");
		}

		if (!cadena.isEmpty()) {
			System.out.println("cadena no esta vacio");
		}

		System.out.println(cadena.trim().toLowerCase());

		// Incremento
		i++;
		System.out.println("i :: " + i);
		i = i + 1;
		System.out.println("i :: " + i);
		// Decremento
		i--;
		System.out.println("i :: " + i);

		d = 1000000d + 1000000d;
		System.out.println("Hola mundo desde Java");
	}

}
