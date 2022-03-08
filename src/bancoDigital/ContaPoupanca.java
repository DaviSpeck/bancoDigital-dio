package bancoDigital;

/**
* @author Davi Speck
* @version 1.0.0
* @since Release 1.0.0
*/
public class ContaPoupanca extends Conta {
   
	/**
     * Atualiza saldo da conta de acordo com valor debitado
     */   
	public void debito(double valor) {
       
		this.saldo = this.saldo - valor;
       
	}
	
	/**
     * Descreve dados da conta bancária
     * 
     * @return Dados da conta bancária corrente (Número, Conta e Saldo)
     */
	@Override
	public String toString() {
		return "Conta Poupança:\nNúmero: " + Integer.toString(this.agencia) + 
				"\nConta: " + Integer.toString(this.numero) +
				"\nSaldo: " + Double.toString(this.saldo) + "\n-------------";
	}
   
}
