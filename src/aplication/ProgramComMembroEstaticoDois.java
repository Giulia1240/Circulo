package aplication;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class ProgramComMembroEstaticoDois {


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio: ");
		Double radius = sc.nextDouble();

		Double c = Calculator.circuferencia(radius);
		Double v = Calculator.volume(radius);

		System.out.printf("Circuferencia: %.2f%n: " + c);
		System.out.printf("Volume: %.2f%n: " + v);
		System.out.printf("Valor de Pi: %.2f%n: " + Calculator.PI);
	}


}
