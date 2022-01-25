package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramComMembroEstatico {

	public static final Double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor do raio: ");
		Double radius = sc.nextDouble();

		Double c = circuferencia(radius);
		Double v = volume(radius);

		System.out.printf("Circuferencia: %.2f%n: " + c);
		System.out.printf("Volume: %.2f%n: " + v);
		System.out.printf("Valor de Pi: %.2f%n: " + PI);
	}

	public static Double circuferencia(Double radius) {

		return 2.0 * PI * radius;
	}

	public static Double volume(Double radius) {

		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
