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

       // Instancia o cliente (Nome, CPF[fictício])
       Cliente cliente = new Cliente("Davi", "11111111111");
 
       
       
       // Instancia uma conta do tipo corrente com valores "default"
       ContaCorrente corrente = new ContaCorrente();
       
       // Cria a conta a partir de cliente instanciado
       corrente.criarConta(cliente, 0);
       
       // Imprime o objeto corrente após criação da conta
       System.out.println(corrente);
       
       // Realiza um depósito de 1000
       corrente.credito(1000);
       
       // Imprime o objeto corrente após depósito
       System.out.println(corrente);
       
       // Realiza um débito de 200
       corrente.debito(200);
       
       // Imprime o objeto corrente após saque
       System.out.println(corrente);
       
       
              
       // Instancia uma conta do tipo poupança com valores "default"
       ContaPoupanca poupanca = new ContaPoupanca();
       
       // Cria a conta poupança a partir do cliente instanciado
       poupanca.criarConta(cliente, 0);
       
       // Imprime o objeto corrente da conta poupança
       System.out.println(poupanca);
      
       // Realiza um deposito de 1000
       poupanca.credito(1000);
       
       // Imprime o objeto corrente após depósito
       System.out.println(poupanca);
       
       // Realiza um débito de 200
       poupanca.debito(200);
       
       // Imprime o objeto corrente após saque
       System.out.println(poupanca);
       
       
       
       // Transferência de 200 reais da poupança para corrente
       poupanca.transferirParaAConta(200, corrente);
       
       // Imprime o objeto corrente das duas contas (Corrente e Poupança)
       System.out.println(corrente);
       System.out.println(poupanca);
       
       // Transferência de 200 reais da corrente para poupança
       corrente.transferirParaAConta(200, poupanca);
       
       // Imprime o objeto corrente das duas contas (Corrente e Poupança)
       System.out.println(corrente);
       System.out.println(poupanca);
       
       sc.close();
       
   }
   
}