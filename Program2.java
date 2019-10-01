package course;

public class Program2 {

	public static void main(String[] args) {
		
		int a, b;
		double result;
		a = 5;
		b = 2;
		
		result = (double)a / b;
		//se nao estiver com o casting (double) ele da o resultado como double, mas somente com o resultado de inteiro
		//ex: 2.0 ao invés de 2.5. Por isso tem que fazer o casting.
		System.out.println(result);		
		
		double c; 
		int d;
		
		c = 5.0;
		d = (int)c;
		
		System.out.println(d);
		
		double result2; 
		int e;
		String s = "33";
		
		e = Integer.parseInt(s);
		result2 = Double.parseDouble(s);
		
		System.out.println(e);
		System.out.println(result2);
		//Integer.parseInt(variavel) = converte variaveis opostas, tipo inteiro e double
		//Double.parseDouble(variavel) = converte variaveis opostas, tipo inteiro e double
		
	}

	
	
}
