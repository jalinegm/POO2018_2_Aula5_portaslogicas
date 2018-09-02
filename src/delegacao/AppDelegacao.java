package delegacao;

public class AppDelegacao {

	public static void main (String args[]) {		
		
		PortaLogica p1 = new PortaLogica(PortaLogica.portaOR);
		
		p1.setEntradas(0, 0);
		
		System.out.println( p1.processaSaida() );
	}
}
