package course;

public class EscopoeInicializacao {

	public static void main(String[] args) {
		
		double price = 400.00;
		double discount = 0;
		// TUDO QUE ESTIVER DENTRO DE UMA CONDICIONAL TIPO IF E ELSE É UM UNICO ESCOPO.
		/* 
		 * AS VARIAVEIS DENTRO NÃO VALEM FORA, PRECISA INICIAR.
		 */
		if (price < 200.00) {
			discount = price * 0.1;
		}

		System.out.println(discount);
		
	}

}
