package course;

import java.util.Locale;
import java.util.Scanner;

public class FinalExerciciosCap2_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double result = a / b; 
			if (b == 0) {
				System.out.println("Divisão Impossível");
			}
			else {
				System.out.printf("%.1f%n", result);
			}
		}
		
		
		
		sc.close();
	}

}
