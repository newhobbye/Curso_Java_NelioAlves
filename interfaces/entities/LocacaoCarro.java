package interfaces.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocacaoCarro {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date saida;
	private Date retorno;
	private Veiculo veiculo;
	private Fatura fatura;

	public LocacaoCarro(Date saida, Date retorno, Veiculo veiculo) {
		this.saida = saida;
		this.retorno = retorno;
		this.veiculo = veiculo;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	
	
}
