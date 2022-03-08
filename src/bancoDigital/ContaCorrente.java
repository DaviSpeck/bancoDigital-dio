package bancoDigital;

/**
* @author Davi Speck
* @version 1.0.0
* @since Release 1.0.0
*/
public class ContaCorrente extends Conta{
	
	/**
     * Quando debitado um valor, a taxa cmpf afeta o saldo
     */   
   public void debito(double valor) {
	   
	   // cpmf � a Contribui��o Provis�ria sobre Movimenta��o Financeira
	   // �ltima taxa foi de 0,38%
       double cpmf = valor * 0.38 / 100;
       
       this.saldo = this.saldo - valor - cpmf;
       
   }
   
   
   /**
    * Descreve dados da conta banc�ria
    * 
    * @return Dados da conta banc�ria corrente (N�mero, Conta e Saldo)
    */ 
   @Override
   public String toString() {
	   
       return "Conta Corrente:\nN�mero: " + Integer.toString(this.agencia) + 
               "\nConta: " + Integer.toString(this.numero) +
               "\nSaldo: " + Double.toString(this.saldo) + "\n-------------\n";
       
   }
   
}
