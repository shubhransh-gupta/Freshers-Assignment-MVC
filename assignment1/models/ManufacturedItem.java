package assignment1.models;

public class ManufacturedItem extends Item {
	private double tax;
	public ManufacturedItem(double price) 
	{
		super(price);		
		tax = 12.5 / 100 * price; 
        tax += 2.0 / 100 * (price + tax);		
	}
	public Double fetchingTax() 
	{
		 // instead of return the whole object, returned a variable of it
	     return tax;
	}

 
}
