package course;

import java.util.Locale;
import java.util.Scanner;

public class FinalExerciciosCap2_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;
		if (n != 0 && n != 1) {

			for (int i = n-1; i > 0; i--) {
				result = n * i;
				n = result;
			}
			System.out.println(result);
		} else {
			result = 1;
			System.out.println(result);
		}
		sc.close();
	}
}
/*
OUTRA FORMA DE FAZER:
int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}



*/