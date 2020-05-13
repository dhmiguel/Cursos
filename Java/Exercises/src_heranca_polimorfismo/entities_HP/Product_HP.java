package entities_HP;

public class Product_HP {
	
	private String name;
	protected Double price;
	
	public Product_HP() {
	
	}
	
	
	public Product_HP(String name, Double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " " +"$ " + price);
		return sb.toString();
	}

}
