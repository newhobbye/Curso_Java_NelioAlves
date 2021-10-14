package interfaces.exercicio1.entidades;

import java.util.Calendar;
import java.util.Date;


public class ContratoServico {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ContratoServico(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processandoContrato(Contrato contrato, Integer meses) {
		double basicoConta = contrato.getValor() / meses;
		for(int i = 1; i<meses; i++) {
			Date data = addMeses(contrato.getData(), i);
			double updateConta = basicoConta + servicoPagamentoOnline.interest(basicoConta, i);
			double totalConta = updateConta + servicoPagamentoOnline.pagamentoTaxa(updateConta);
			contrato.addParcelas(new Parcelas(data, totalConta));
		}
	}
	
	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
