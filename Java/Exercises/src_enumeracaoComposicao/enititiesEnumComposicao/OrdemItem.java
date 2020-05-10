package enititiesEnumComposicao;

public class OrdemItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	
	public OrdemItem() {
	}

	public OrdemItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTtotal() {
		return this.quantity * this.price;
	}
}
