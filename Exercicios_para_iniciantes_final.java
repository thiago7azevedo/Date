package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_final {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		//Ínicio Exemplo 1
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("SOMA = " + soma); //concatena quando nãu usa o printf
		System.out.printf("A soma de %d com %d é %d!%n", n1, n2, soma);
		
		
		//Fim exemplo 1
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		//Inicio exemplo 2
		
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int soma2 = n3 + n4;
		
		System.out.println("SOMA = " + soma2);
		System.out.printf("Devemos somar o valor de %d + %d. O total fica o valor de %d%n", n3, n4, soma2,".");
				
		//Fim exemplo 2
		//Ínicio exemplo 3
		int n5, n6, soma3;
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		soma3 = n5 + n6;
	
		System.out.println("SOMA = " + soma3);
		System.out.printf("Os valores %d e %d somados é de %d: ", n5, n6, soma3);
		
		sc.close();
	}

}
