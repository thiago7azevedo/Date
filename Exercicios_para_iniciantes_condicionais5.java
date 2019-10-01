package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		double CC, XS, XB, TS, R, total;
		CC = 4.00;
		XS = 4.50;
		XB = 5.0;
		TS = 2.0;
		R = 1.50;
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		if (n1 == 1) {
			total = CC * n2;
		}
		
		else if (n1 == 2) {
			total = XS * n2;
		}
		
		else if (n1 == 3) {
			total = XB * n2;
		}
		
		else if (n1 == 4) {
			total = TS * n2;
		}
		
		else {
			total = R * n2;
		}
		
		System.out.printf("Total: R$%.2f", total);
		sc.close();
	}

}
/**

OUTRO EXEMPLO DE COMO PROCEDER COM ESTE CÓDIGO, SEM INICIAR VARIAVEIS COM PREÇOS.
MULTIPLICAR O N2 U QUANTIDADE PELO VALOR REQUERIDO.

Scanner sc = new Scanner(System.in);
int codigo = sc.nextInt();
int quantidade = sc.nextInt();

double total;
if (codigo == 1) {
	total = quantidade * 4.0;
}
else if (codigo == 2) {
	total = quantidade * 4.5;
}
else if (codigo == 3) {
	total = quantidade * 5.0;
}
else if (codigo == 4) {
	total = quantidade * 2.0;
}
else {
	total = quantidade * 1.5;
}

System.out.printf("Total: R$ %.2f%n", total);
*/