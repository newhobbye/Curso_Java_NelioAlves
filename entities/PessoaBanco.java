package entities;

public class PessoaBanco {
	private int conta;
	private String nome;
	private double valor;
	
	public PessoaBanco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public PessoaBanco(int conta, String nome, double inicialValor) {
		this.conta = conta;
		this.nome = nome;
		DepositoConta(inicialValor);
	}
	
	public void DepositoConta(double valor) {
		this.valor += valor;
	}
	
	public void SaqueConta(double valor) {
		this.valor = valor - 5;
	}

	public int getConta() {
		return conta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	
	public String toString() {
		return "Conta: " + conta + ", Cliente: " + nome + ", Saldo: " + valor;
	}
	
	

}
