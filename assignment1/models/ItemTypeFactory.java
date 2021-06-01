package assignment1.models;

public class ItemTypeFactory{
	private double price;
    
    public ItemTypeFactory(double price) 
    {
        this.price = price;
    }  
    //based on the item type fetch the tax using factory
    public Double calcTax(String type) 
    {
	   Item tempItem;
	   switch (type) 
	   {
       case "raw":
                 tempItem= new RawItem(this.price);
                 return tempItem.fetchingTax();
       case "manufactured":
    	         tempItem= new ManufacturedItem(this.price);
                 return tempItem.fetchingTax();
       case "imported":
    	         tempItem= new ImportedItem(this.price);
                 return tempItem.fetchingTax();
       default:
                 return null;
       }
    }  
}
