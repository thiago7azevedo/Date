package course;

import java.util.Locale; //automarico após linha para imprimir ponto (.)

public class Program3 {

	public static void main(String[] args) {
		
		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		System.out.print("Good morning!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("---------------------------");
		System.out.println(balance);
		System.out.printf("%.2f%n", balance); //o f no final do print é mascara de formatacao, para mostrar variaves de forma personalizada 
		System.out.printf("%.4f%n", balance);//s%. para numero. 2 e 4 são casas decimais que quer mostrar. %n para quebrar linha.
		Locale.setDefault(Locale.US); // imprimir numeros com ponto (.) ao invés de virgula (,).
		System.out.printf("%.4f%n", balance);
		System.out.println("---------------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age,
		gender, balance);
		//sysout + crtl/espaço ele auto-completa
		
//%s = String / %d = tipo int / %. = tipo double / %c = tipo char / 
		}

}
