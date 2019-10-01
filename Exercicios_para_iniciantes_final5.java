package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_final5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		double valor, valor2, total, total2, valorApagar;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		valor = sc.nextDouble();
		n3 = sc.nextInt();
		n4 = sc.nextInt();		
		valor2 = sc.nextDouble();
		total = valor * n2;
		total2 = valor2 * n4;
		valorApagar = total + total2;
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorApagar);
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		
	sc.close();
	}

}
