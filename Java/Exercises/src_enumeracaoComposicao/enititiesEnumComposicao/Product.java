package enititiesEnumComposicao;

public class Product {
	
	private String name;
	private Double price;

	//Construtor Padrão
	public Product() {
		
	}
	//Construtor com argumentos
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//Getters e Setters para manipulação da classe
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
}
