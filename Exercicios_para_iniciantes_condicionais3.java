package course;

import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�O MULTIPLOS");
			
		}
		else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();
	}

}
