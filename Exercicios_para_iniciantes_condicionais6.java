package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1;
		n1 = sc.nextDouble();
		
		if (n1 >= 0 && n1 <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (n1 > 25 && n1 <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if (n1 > 50 && n1 <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if (n1 > 75 && n1 <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
						
		sc.close();
	}

}

/**
OUTRA FORMA DE SER FEITO

if (numero < 0.0 || numero > 100.0) {
System.out.println("Fora de intervalo");
}
else if (numero <= 25.0) {
System.out.println("Intervalo [0,25]");
}
else if (numero <= 50.0) {
System.out.println("Intervalo (25,50]");
}
else if (numero <= 75.0) {
System.out.println("Intervalo (50,75]");
}		
else {
System.out.println("Intervalo (75,100]");
}
**/