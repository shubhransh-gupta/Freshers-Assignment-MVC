package assignment1.models;

public class RawItem extends Item {
   private double tax;	
   public RawItem(double price) 
   {
		super(price);
		tax = (12.5 / 100) * price;
   }
   public Double fetchingTax() 
   {    
	    // instead of return the whole object, returned a variable of it
        return tax;
   }  
}
