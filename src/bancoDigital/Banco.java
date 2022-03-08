package bancoDigital;

import java.util.Scanner;

/**
* @author Davi Speck
* @version 1.0.0
* @since Release 1.0.0
*/
public class Banco {

   /**
    * @param args   argumentos da linha de comando
    */
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner (System.in);

       // Instancia o cliente (Nome, CPF[fict�cio])
       Cliente cliente = new Cliente("Davi", "11111111111");
 
       
       
       // Instancia uma conta do tipo corrente com valores "default"
       ContaCorrente corrente = new ContaCorrente();
       
       // Cria a conta a partir de cliente instanciado
       corrente.criarConta(cliente, 0);
       
       // Imprime o objeto corrente ap�s cria��o da conta
       System.out.println(corrente);
       
       // Realiza um dep�sito de 1000
       corrente.credito(1000);
       
       // Imprime o objeto corrente ap�s dep�sito
       System.out.println(corrente);
       
       // Realiza um d�bito de 200
       corrente.debito(200);
       
       // Imprime o objeto corrente ap�s saque
       System.out.println(corrente);
       
       
              
       // Instancia uma conta do tipo poupan�a com valores "default"
       ContaPoupanca poupanca = new ContaPoupanca();
       
       // Cria a conta poupan�a a partir do cliente instanciado
       poupanca.criarConta(cliente, 0);
       
       // Imprime o objeto corrente da conta poupan�a
       System.out.println(poupanca);
      
       // Realiza um deposito de 1000
       poupanca.credito(1000);
       
       // Imprime o objeto corrente ap�s dep�sito
       System.out.println(poupanca);
       
       // Realiza um d�bito de 200
       poupanca.debito(200);
       
       // Imprime o objeto corrente ap�s saque
       System.out.println(poupanca);
       
       
       
       // Transfer�ncia de 200 reais da poupan�a para corrente
       poupanca.transferirParaAConta(200, corrente);
       
       // Imprime o objeto corrente das duas contas (Corrente e Poupan�a)
       System.out.println(corrente);
       System.out.println(poupanca);
       
       // Transfer�ncia de 200 reais da corrente para poupan�a
       corrente.transferirParaAConta(200, poupanca);
       
       // Imprime o objeto corrente das duas contas (Corrente e Poupan�a)
       System.out.println(corrente);
       System.out.println(poupanca);
       
       sc.close();
       
   }
   
}