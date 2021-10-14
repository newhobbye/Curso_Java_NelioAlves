package entities;

public class ContaBanco {
	private int conta;
	private String nome;
	private double deposito;
	
	public ContaBanco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;		
	}
	
	public ContaBanco(int conta, String nome, double deposito) {
		this.conta = conta;
		this.nome = nome;
		depositar(deposito);
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

	public double getDeposito() {
		return deposito;
	}

	public void depositar(double depositar) {
		deposito += depositar;
	}
	
	public void sacar(double saque) {
		deposito -= saque - 5;
	}
	
	public String toString() {
		return "Conta: " 
				+ conta
				+ ", Titular: "
				+ nome
				+ ", Valor em conta: "
				+ deposito;
	}
}
