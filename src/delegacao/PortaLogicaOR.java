package delegacao;

public class PortaLogicaOR {
	
	private int entrada1;
	private int entrada2;
	
	private boolean validarEntrada(int valor){
		if ((valor <0) || (valor >1))
			return false;
		else
			return true;
	}
	
	public void ajustarEntradas(int a, int b){
		if(validarEntrada(a))
			entrada1 = a;
		else
			System.out.println("valor invalido para a entrada 1");
			
		if(validarEntrada(b))
			entrada2 = b;
		else
			System.out.println("valor invalido para a entrada 2");
	}
	
	public int processaSaida(){
		if ((entrada1 == 1) || (entrada2 == 1))
			return 1;
		else
			return 0;
	}
}

