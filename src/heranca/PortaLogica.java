package heranca;

public class PortaLogica {
	
	private int entrada1;
	private int entrada2;

	public PortaLogica(int entrada1, int entrada2) {
		this.entrada1 = entrada1;
		this.entrada2 = entrada2;
		ajustarEntradas(entrada1, entrada2);
		System.out.println("construtor de PortaLogica foi acionado ***");
	}	
	
	public int getEntrada1() {
		return entrada1;
	}
	
	public int getEntrada2() {
		return entrada2;
	}
	
	private boolean validarEntrada(int valor){
		if ((valor <0) || (valor >1))
			return false;
		else
			return true;
	}
	
	private void ajustarEntradas(int a, int b){
		if(validarEntrada(a))
			entrada1 = a;
		else
			System.out.println("valor invalido para a entrada 1");
			
		if(validarEntrada(b))
			entrada2 = b;
		else
			System.out.println("valor invalido para a entrada 2");
	}
	
	public int processaSaida() {
		
		return -1; //caso não seja válida a entrada
		
	}
	
	
}

