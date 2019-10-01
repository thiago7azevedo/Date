package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_final6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = A * C / 2.0; 
		circulo = 3.14159 * C * C;
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRIANGULO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
			
		
		sc.close();
	}

}
