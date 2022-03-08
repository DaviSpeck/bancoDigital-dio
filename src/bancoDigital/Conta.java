package bancoDigital;

import java.util.Random;

/**
* @author Davi Speck
* @version 1.0.0
* @since Release 1.0.0
*/
public abstract class Conta {
    
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    
    
    /**
     * Construtor da classe
     *
     * @param numero      N�mero da conta banc�ria
     * @param agencia     Ag�ncia da conta banc�ria
     * @param saldo       Saldo da conta banc�ria
     * @param cliente     Cliente detentor da conta
     */
    public Conta() {
    	
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0;
        this.cliente = null;
        
    }
    
    /**
     * Cria a conta com uma conta e ag�ncia aleat�ria
     */
    public void criarConta(Cliente cliente, double saldoInicial) {
    	
        Random random = new Random();
        int numConta = random.nextInt(1000000);
        int numAgencia = random.nextInt(1000);
        this.cliente = cliente;
        this.numero = numConta;
        this.agencia = numAgencia;
        this.saldo = saldoInicial;
        
    }
    
    /**
     * Adiciona valor � conta (credita)
     */
    public void credito(double valor) {
    	
        this.saldo = this.saldo + valor;
        
    }
    
    /**
     * Transfere valor de uma conta para outra
     */
    public void transferirParaAConta(double valor, Conta conta){
        
        this.debito(valor);
        conta.credito(valor);
        
    }
    
    /**
     * Retira valor da conta (debita)
     */
    public abstract void debito(double valor);
    
        
}
