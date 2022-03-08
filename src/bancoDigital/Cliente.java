package bancoDigital;

/**
* @author Davi Speck
* @version 1.0.0
* @since Release 1.0.0
*/
public class Cliente {
    
    private String nome;
    private String cpf;
    
    /**
     * Construtor da classe
     *
     * @param nome    Nome do cliente
     * @param cpf     CPF do cliente
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
    
}