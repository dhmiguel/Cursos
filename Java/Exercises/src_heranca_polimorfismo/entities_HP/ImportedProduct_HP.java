package entities_HP;

public final class ImportedProduct_HP extends Product_HP {
	
	private Double customsFee;

	
	public ImportedProduct_HP() {
		super();
	}
	
	public ImportedProduct_HP(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + "(Customs fee: $" + customsFee + ")";
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	

}
