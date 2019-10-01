package course;

import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		
		sc.close();
	}

}
