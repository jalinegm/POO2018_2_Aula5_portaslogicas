package ex_deitel_deitel;
// Fig. 9.5: CommissionEmployeeTest.java
// Testing class CommissionEmployee.

public class TesteEmpregadoComissionado 
{
   public static void main( String args[] ) 
   {
      // instantiate CommissionEmployee object
      EmpregadoComissionado employee = new EmpregadoComissionado("Sue", "Jones", "222-22-2222", 10000, .06 );
      
      System.out.println("Informações: \n" );
      System.out.printf( "%s %s\n", "Nome é",
         employee.getNome());
      System.out.printf( "%s %s\n", "Sobrenome é", 
         employee.getSobrenome());
      System.out.printf( "%s %s\n", "Número Social é", 
         employee.getNumSeguroSocial());
      System.out.printf( "%s %.2f\n", "Venda Bruta é", 
         employee.getVendaBruta());
      System.out.printf( "%s %.2f\n", "Taxa de Comissão é",
         employee.getTaxaComissao());

      employee.setVendaBruta(500);
      employee.setTaxaComissao(.1);
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Informações do empregado atualizadas em toString", employee );
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
