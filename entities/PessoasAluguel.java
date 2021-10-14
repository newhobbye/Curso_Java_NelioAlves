package entities;

public class PessoasAluguel {
	private String nome;
	private String email;
	
	public PessoasAluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
		
	}
	
	public String getName() {
		return nome;
		}
	
	public void setName(String nome) {
		this.nome = nome;
		
	}
	
	public String getEmail() {
		return email;
		}
	
	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public String toString() {
		return nome + ", " + email;
	}
	

		
		
	

}
