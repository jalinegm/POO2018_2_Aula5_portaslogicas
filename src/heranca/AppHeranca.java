package heranca;

public class AppHeranca {

	public static void main (String args[]) {		
		
		PortaLogicaAND porta1 = new PortaLogicaAND(1,1);
		PortaLogicaOR  porta2 = new PortaLogicaOR(0,0);
		
			
		System.out.println( porta1.processaSaida() );
		
		System.out.println( porta2.processaSaida() );
		
	}
}
