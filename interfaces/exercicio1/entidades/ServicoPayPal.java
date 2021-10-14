package interfaces.exercicio1.entidades;

public class ServicoPayPal implements ServicoPagamentoOnline {

	private static final Double taxaPagamento = 0.2;
	private static final Double taxaMes = 0.1;
	
	@Override
	public Double pagamentoTaxa(Double quantia) { 
		return quantia * taxaPagamento;
	}

	@Override
	public Double interest(Double quantia, Integer meses) { 
		return quantia * taxaMes * meses;
	}

}
