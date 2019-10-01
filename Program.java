package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// ponto de entrada da aplicação public static

		// indentação automariva ctrl + shift + f
		
		Scanner sc = new Scanner(System.in);
		// scanner eh uma classe que vem no API do JAVA. Precisa importar lá em cima
		// java.util
		System.out.println("Hello world!");
		sc.close();
		//quando não precisa mais da váravel neste caso scanner precisa encerrar desta forma

		boolean completed = false;
		char gender = 'F';
		char latter = '\u0041';
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 21474836478L;
		float n5 = 4.5f;
		double n6 = 4.5;
		
	// inicio string e object
		String name = "Mara Avelina";
		Object obj1 = "alex Bronw";
		Object obj2 = 4.5;

		System.out.println(name);
		System.out.println(obj1);
		System.out.println(obj2);
	// fim string e object
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(latter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);

		// aula

	}

}
