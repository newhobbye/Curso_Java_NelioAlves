package entities;

public class OrdemItem {
	private Integer quantidade;
	private Double price;

	public OrdemItem(Integer quantidade, Double price) {
		this.quantidade = quantidade;
		this.price = price;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantidade * price;
	}
}

