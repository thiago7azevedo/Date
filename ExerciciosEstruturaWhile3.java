package course;

import java.util.Scanner;

public class ExerciciosEstruturaWhile3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 2002) {
			System.out.println("Senha inválida!");
			n = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
