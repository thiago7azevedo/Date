package course;

import java.util.Scanner;

public class ExerciciosForWhileFixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();		
		while (n <= 0) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		
		int maior = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i+": ");
			int n2 = sc.nextInt();
			if (n2 > maior) {
				maior = n2;
			}			
		}	

		System.out.println("Higher = " + maior);
		sc.close();
	}

}

/**
* OURA FORMA DE FAZER NO FINAL DO FOR
*Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
int n = sc.nextInt();
while (n <= 0) {
System.out.print("N must be positive! Try again: ");
n = sc.nextInt();
}
int higher = Integer.MIN_VALUE;
for (int i = 1; i <= n; i++) {
System.out.print("Value #" + i + ": ");
int x = sc.nextInt();
if (x > higher) {
higher = x;
}
}
System.out.println("Higher = " + higher);
sc.close();
}
}
*
**/