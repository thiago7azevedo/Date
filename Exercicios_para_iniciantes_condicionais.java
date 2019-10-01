package course;

import java.util.Scanner;

public class Exercicios_para_iniciantes_condicionais {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 
	 if (n < 0) {
		System.out.println("NEGATIVO");
	 }
	 else {
		 System.out.println("NÃO NEGATIVO");
	 }
	 
	 sc.close();
	 
	}

}
