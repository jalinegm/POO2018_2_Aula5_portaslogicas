package delegacao;

public class PortaLogica {

	public static final int portaAND = 1;
	public static final int portaOR = 2;
	
	private int tipo = 0;
	
	PortaLogicaAND pAND;
	PortaLogicaOR pOR;
	
	public PortaLogica(int tipo) {
		
		if (tipo == portaAND) {
			this.tipo = portaAND;
			pAND = new PortaLogicaAND();
		} else if (tipo == portaOR) {
			this.tipo = portaOR;
			pOR = new PortaLogicaOR();
		}
	}
	
	public void setEntradas(int ent1, int ent2) {
		if (tipo == portaAND)
		    pAND.ajustarEntradas(ent1, ent2);
		else if (tipo == portaOR)
		    pOR.ajustarEntradas(ent1, ent2);
	}
	
	public int processaSaida() {
		
		if (tipo == portaAND)
		   return pAND.processaSaida();
		else if (tipo == portaOR)
		   return pOR.processaSaida();
		   
	    return -1;
	}
	
}
