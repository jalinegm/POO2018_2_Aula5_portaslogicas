package ex_deitel_deitel;


public class EmpregadoComissionado
{
	private String nome;
	private String sobrenome;
	private String numSeguroSocial;
	private double vendaBruta;
	private double taxaComissao;

	public EmpregadoComissionado( String nome, String sobrenome, String numSeguroSocial, double vendas, double taxa ){  
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numSeguroSocial = numSeguroSocial;
		setVendaBruta( vendas ); // validate and store gross sales
		setTaxaComissao( taxa ); // validate and store commission rate
	}


	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getSobrenome() {
		return sobrenome;
	}




	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}




	public String getNumSeguroSocial() {
		return numSeguroSocial;
	}




	public void setNumSeguroSocial(String numSeguroSocial) {
		this.numSeguroSocial = numSeguroSocial;
	}




	public double getVendaBruta() {
		return vendaBruta;
	}




	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setVendaBruta( double venda )
	{
		vendaBruta = ( venda < 0.0 ) ? 0.0 : venda;
	}

	public void setTaxaComissao( double taxa )
	{
		taxaComissao = ( taxa > 0.0 && taxa < 1.0 ) ? taxa : 0.0;
	}	
	public double lucros()
	{
		return taxaComissao * vendaBruta;
	} 
	
	public String toString()
	{
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
				"empregado", nome, sobrenome, 
				"nº seguro social", numSeguroSocial, 
				"venda bruta", vendaBruta, 
				"taxa de comissão", taxaComissao );
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
