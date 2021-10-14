package interfaces.services;

import interfaces.entities.Fatura;
import interfaces.entities.LocacaoCarro;

public class ServicoAluguel {

	private Double precoPorHora;
	private Double precoPorDia;
	
	ServicoTaxa taxaBrasil;

	public ServicoAluguel(Double precoPorHora, Double precoPorDia, ServicoTaxa taxaBrasil) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaBrasil = taxaBrasil;
	}
	
	public void processandoFatura(LocacaoCarro locacaoCarro) {
		long t1 = locacaoCarro.getSaida().getTime();
		long t2 = locacaoCarro.getRetorno().getTime();
		double horas = (double)(t2-t1) / 1000 / 60 / 60;
		
		double pagamentoBasico;
		if(horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		}
		else {
			pagamentoBasico = Math.ceil(horas / 24) * precoPorDia;
		}
		double taxa = taxaBrasil.taxa(pagamentoBasico);
		locacaoCarro.setFatura(new Fatura(pagamentoBasico, taxa));
	}
}
