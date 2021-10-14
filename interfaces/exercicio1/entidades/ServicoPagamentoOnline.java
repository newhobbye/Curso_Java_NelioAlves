package interfaces.exercicio1.entidades;

public interface ServicoPagamentoOnline {

	public Double pagamentoTaxa(Double quantia);
	
	public Double interest(Double quantia, Integer meses);
}

