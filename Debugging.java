package course;

import java.util.Scanner;

public class Debugging {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
 * crtl + shift + b atalho para iniciar a linha do debugging
 * ou
 * seleciona a linha que quer e vai em run + toggle breakpoint
 * depois clica no inseto debugging para ativar
 * derpois vai em f6 para ir pulando as linhas
 * ou 
 * step over la em cima
 * 
 * 
 * CASO QUEIRA IR PASSO A PASSO ATÉ DENTRO DAS FUNÇÕES CRIADAS
 * MESMOS PASSOS ACIMA, MAS AO INVÉS DE IR EM F6 OU EM STEP OVER
 * VAI EM F5 OU STEP INTO
 */
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}

	


