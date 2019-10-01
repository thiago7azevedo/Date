package course;

import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n1, n2, total;
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	//%s = String / %d = tipo int / %. = tipo double / %c = tipo char 
	
	if (n1 < n2){
		total = (n2 - n1);
		System.out.printf("O JOGO DUROU %d HORA (S)", total);
			
	}
	
	else {
		total = 24 - (n1 - n2);			
		System.out.printf("O JOGO DUROU %d HORA (S)", total);
	}
	sc.close();
	}

}
