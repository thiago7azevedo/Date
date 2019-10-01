package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_final2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//inicio Exemplo 1
		double raio = sc.nextDouble();
		double tt = 3.14159;
		double area = tt * (raio * raio);
		
		System.out.printf("A = %.4f%n", area);
		System.out.printf("O valor da área correspondente é de %.4f%n", area);
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		//fim exemplo 1
		//inicio exemplo 2
		
		double raio2 = sc.nextDouble();
		double tt2 = 3.14159;
		double area2 = tt2 * (raio2 * raio2);		
		
		System.out.printf("A = %.4f%n", area2);
		//fim exemplo2
		//inicio exemplo3
		
		double raio3 = sc.nextDouble();
		double tt3 = 3.14159;
		double area3 = tt3 * (raio3 * raio3);
		
		System.out.printf("A = %.4f%n", area3);
		
		sc.close();
	}

}
