package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double entrada, saida;
		entrada = sc.nextDouble();
				
		if (entrada <= 2000) {
			System.out.println("Isento");
		}
		
		else if (entrada > 2000 && entrada <= 3000) {
			saida = (entrada - 2000) * 0.08;
			System.out.printf("O valor de imposto a ser pago é de R$ %.2f%n", saida);
		}
		
		else if (entrada > 3000 && entrada <= 4500) {
			saida = (entrada - 3000) * 0.18 + 79.9992;
			System.out.printf("O valor de imposto a ser pago é de R$ %.2f%n", saida);
			}
		else  {
			saida = (entrada -4500) * 0.28 + 79.9992 + 269.9982;
			System.out.printf("O valor de imposto a ser pago é de R$ %.2f%n", saida);
		}
				
		sc.close();
	}

}

/*

OUTRA FORMA DE FAZER O EXERCICIO:

double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}

*/