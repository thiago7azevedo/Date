package course;

import java.util.Scanner;

public class FinalExerciciosCap2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int n2 = i * n;
			System.out.println(i + " X " + n + " = " + n2);
		}
				
		sc.close();

	}

}
