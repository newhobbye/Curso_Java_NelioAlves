package interfaces.exercicio1.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataP;
	private Double quantia;
	
	
	public Parcelas(Date dataP, Double quantia) {
		this.dataP = dataP;
		this.quantia = quantia;
	}


	public Date getDataP() {
		return dataP;
	}


	public void setDataP(Date dataP) {
		this.dataP = dataP;
	}


	public Double getQuantia() {
		return quantia;
	}


	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataP) + " - " + String.format("%.2f", quantia);
 	}
	
	
	

}
