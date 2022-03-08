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
     * Descreve dados da conta banc�ria
     * 
     * @return Dados da conta banc�ria corrente (N�mero, Conta e Saldo)
     */
	@Override
	public String toString() {
		return "Conta Poupan�a:\nN�mero: " + Integer.toString(this.agencia) + 
				"\nConta: " + Integer.toString(this.numero) +
				"\nSaldo: " + Double.toString(this.saldo) + "\n-------------";
	}
   
}
