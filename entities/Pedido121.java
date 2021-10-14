package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status121;

public class Pedido121 {
	private Date moment;
	private Status121 status;
	private List<OrdemItem> itens = new ArrayList<>();
	
	public Pedido121(Date moment, Status121 status) {
		this.moment = moment;
		this.status = status;
	}
	
	public Pedido121(Status121 status) {
		this.status = status;
	}
	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Status121 getStatus() {
		return status;
	}

	public void setStatus(Status121 status) {
		this.status = status;
	}
	
	public void addItem(OrdemItem item) {
		itens.add(item);	
	}
	
	public void removeItem(OrdemItem item) {
		itens.remove(item);
	}
	
	

}
