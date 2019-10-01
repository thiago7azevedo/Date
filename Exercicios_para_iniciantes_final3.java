package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_final3 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int dif = (n1 * n2) - (n3 * n4);
		//%s = String / %d = tipo int / %. = tipo double / %c = tipo char /
		System.out.println("DIFERENÇA = " + dif);
		
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int n7 = sc.nextInt();
		int n8 = sc.nextInt();
		int dif2 = (n5 * n6) - (n7 * n8);
		
		System.out.println("DIFERENÇA = " + dif2);
		
		sc.close();
	}

}
