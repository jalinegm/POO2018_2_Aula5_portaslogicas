package ex_deitel_deitel;

public class EmpregadoComissionadoComBase extends EmpregadoComissionado
{
	private double salarioBase; 

	public EmpregadoComissionadoComBase( String nome, String sobrenome, String num, double vendas, double taxa, double salario )
	{
		super( nome, sobrenome, num, vendas, taxa );
		setSalarioBase( salario );
	}

	public void setSalarioBase( double salario )
	{
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	}


	public double getSalarioBase() {
		return salarioBase;
	}




	@Override
	public double lucros() {
		// TODO Auto-generated method stub
		return getSalarioBase()+super.lucros();
	}

	public String toString()
	{
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
				"empregado", getNome(), getSobrenome(), 
				"nº seguro social", getNumSeguroSocial(), 
				"venda bruta", getVendaBruta(), 
				"taxa de comissão", getTaxaComissao(),
				"salário base", getSalarioBase());
	}
}



	/**************************************************************************
	 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
	 * Pearson Education, Inc. All Rights Reserved.                           *
	 *                                                                        *
	 * DISCLAIMER: The authors and publisher of this book have used their     *
	 * best efforts in preparing the book. These efforts include the          *
	 * development, research, and testing of the theories and programs        *
	 * to determine their effectiveness. The authors and publisher make       *
	 * no warranty of any kind, expressed or implied, with regard to these    *
	 * programs or to the documentation contained in these books. The authors *
	 * and publisher shall not be liable in any event for incidental or       *
	 * consequential damages in connection with, or arising out of, the       *
	 * furnishing, performance, or use of these programs.                     *
	 *************************************************************************/
