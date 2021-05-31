package assignment1.models;

public class RawItem extends Item {
  private double tax;	
  public RawItem(double price) {
		super(price);
		// TODO Auto-generated constructor stub
		 tax = (12.5 / 100) * price;
	}
 

  public Double getterTax() {
      return tax;
  }
  
}
