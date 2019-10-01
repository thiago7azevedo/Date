package course;

import java.util.Scanner;

public class ExerciciosEstruturaWhile5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, al, gas, di;
		n = sc.nextInt();
		al = 0;
		gas = 0;
		di = 0;

		while (n != 4) {
			if (n == 1) {
				al = al + 1;
			} else if (n == 2) {
				gas = gas + 1;
			} else if (n == 3) {
				di = di + 1;
			} 
			n = sc.nextInt();
		}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + al);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + di);

		sc.close();
	}

}
