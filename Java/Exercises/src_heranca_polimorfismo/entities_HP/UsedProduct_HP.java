package entities_HP;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct_HP extends Product_HP {
	private Date manufactureDate;

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct_HP() {
		super();
	}
	
	public UsedProduct_HP(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " used $  " + super.getPrice() + "(Manufacture date: " + sdf.format(manufactureDate) + ")"; 
	}

}
