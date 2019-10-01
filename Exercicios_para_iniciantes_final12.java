package course;

import java.util.Scanner;

public class Exercicios_para_iniciantes_final12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("Higer = "+ n1);
		}
	
		else if (n2 >= n1 && n2 >= n3) {
			System.out.println("Higer = "+ n2);
		}
		
		else {
			System.out.println("Higer = " + n3);
		}
		
		
	sc.close();	
	}	

}
