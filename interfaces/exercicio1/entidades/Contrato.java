package interfaces.exercicio1.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private Date data;
	private Double valor;
	
	private List<Parcelas> parcelas = new ArrayList<>();
	
	public Contrato(Integer numero, Date data, Double valor) {
		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	
	public void addParcelas(Parcelas parcelas) {
		this.parcelas.add(parcelas);
	}
	
	public void removeParcelas(Parcelas parcelas) {
		this.parcelas.remove(parcelas);
	}
	
	
	
	

}
