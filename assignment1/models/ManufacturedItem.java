package assignment1.models;

public class ManufacturedItem extends Item {
	private double tax;
	public ManufacturedItem(double price) {
		super(price);
		// TODO Auto-generated constructor stub
		tax = 12.5 / 100 * price; 
        tax += 2.0 / 100 * (price + tax);
		
	}

	 public Double getterTax() {
	        return tax;
	    }

 
}
