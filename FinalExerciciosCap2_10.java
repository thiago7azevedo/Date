package course;

import java.util.Scanner;

public class FinalExerciciosCap2_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
		int cubo = i * i * i;
		int quadrado = i * i;
		System.out.println(i + " " + quadrado + " " + cubo);
		
		}
		sc.close();
	}

}

/*
 * OUTRA MANEIR DE FAZER
 * int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}
}*/
