package course;

import java.util.Locale;
import java.util.Scanner;

public class Program_exercicio_aula_18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = scan.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int nro = scan.nextInt();
		System.out.println("Enter product price:");
		double price = scan.nextDouble();
		System.out.println("Enter your last name, age nd height (same line):");
		String cor = scan.next();
		int nro2 = scan.nextInt();
		double alt = scan.nextDouble();
		
		System.out.println(name);
		System.out.println(nro);
		System.out.println(price);
		System.out.println(cor);
		System.out.println(nro2);
		System.out.println(alt);
		
		
		
		scan.close();
	}

}
