package assignment1.models;

public class ImportedItem extends Item {
	private double tax;
	public ImportedItem(double price) 
	{
		super(price);
		// TODO Auto-generated constructor stub
		tax = 10.0 / 100 * price;
	    if (tax <= 100) 
	    {
	        tax += 5;
	    }
	    else if (tax >= 100 && tax <= 200) 
	    {
	        tax += 10;
	    }
	    else 
	    {
	        // 5 % of final cost which means original price + tax
	        tax += 5.0 / 100 * (tax + price); 
	    }
	}   
    public Double fetchingTax() 
    {
    	// instead of return the whole object, returned a variable of it
        return tax;
    }
}
