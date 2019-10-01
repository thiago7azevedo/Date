package course;

import java.util.Locale;
import java.util.Scanner;

public class FinalExerciciosCap2_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {
			int n2 = sc.nextInt();
			if (n2 >= 10 && n2 <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
