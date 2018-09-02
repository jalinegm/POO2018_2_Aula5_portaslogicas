package heranca;

public class PortaLogicaOR extends PortaLogica {

	public PortaLogicaOR(int a, int b) {
		super(a, b);
	}

	public int processaSaida(){
		if ((getEntrada1() == 1) || (getEntrada2() == 1))
			return 1;
		else
			return 0;
	}

}
