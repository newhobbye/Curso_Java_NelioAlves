package entities.enums;

public enum Status121 {
	AGUARDANDO_PAGAMENTO(0),
	PROCESSANDO(1),
	ENVIADO(2),
	ENTREGUE(3);
	
	private final int valor;
	
	Status121(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

	
}
