package course;

public class Exercicios_para_iniciantes_final8 {

	public static void main(String[] args) {
		
		boolean c1 = 2 > 3 || 4 != 5; // true
		boolean c2 = !(2>3) && 4 != 5; // true
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("--------------");
		boolean c3 = 10 < 5; // false
		boolean c4 = c1 || c2 && c3; // true
		System.out.println(c4);

	}

}
