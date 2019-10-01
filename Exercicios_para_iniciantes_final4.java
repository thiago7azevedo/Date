package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_final4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nFunc, horasTrab;		
		double valor, salario;
		
		nFunc = sc.nextInt();
		horasTrab = sc.nextInt();		
		valor = sc.nextDouble();
		salario = horasTrab * valor;
		
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		System.out.println("NUMBER = " + nFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		int nFunc2, horasTrab2;
		double valor2, salario2;
		nFunc2 = sc.nextInt();
		horasTrab2 = sc.nextInt();		
		valor2 = sc.nextDouble();
		salario2 = horasTrab2 * valor2;
		System.out.println("NUMBER = " + nFunc2);
		System.out.printf("SALARY = U$ %.2f%n", salario2);
		
		
		int nFunc3, horasTrab3;
		double valor3, salario3;		
		nFunc3 = sc.nextInt();
		horasTrab3 = sc.nextInt();		
		valor3 = sc.nextDouble();
		salario3 = horasTrab3 * valor3;
		System.out.println("NUMBER = " + nFunc3);
		System.out.printf("SALARY = U$ %.2f%n", salario3);
		
		sc.close();
	}

}
