package course;

import java.util.Locale;
import java.util.Scanner;

public class FinalExerciciosCap2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, soma;
		System.out.println("Enter three student scores: ");
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();

		soma = n1 + n2 + n3;

		if (soma < 60.00) {
			System.out.printf("Final Score = %.2f%n", soma);
			System.out.println("FAILED");
		}

		else {
			System.out.printf("Final Score = %.2f%n", soma);
		}

		sc.close();
	}

}
