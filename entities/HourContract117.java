package entities;

import java.util.Date;

public class HourContract117 {
	
	private Date date; //NAO ENTENDI MUITO BEM O PORQUE FOI USADO O DATE JUNTO AO CALENDAR
	private Double valuePerHour; //TENHO UM POUCO DE DUVIDAS DO PORQUE FORAM USADOS WRAPPERS AO INVES DE TIPOS PRIMITIVOS
	private Integer hours;
	
	public HourContract117() {//CONSTRUTOR VAZIO... 
		
	}

	public HourContract117(Date date, Double valuePerHour, Integer hours) {//CONSTRUTOR COM PARAMETROS
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {//GUETTERS AND SETTERS
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {//METODO CRIADO PARA MULTIPLICAR OS GANHOS POR HORA X HORAS
		return valuePerHour * hours;
	}
	
	

}
