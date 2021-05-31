package assignment1.models;

public class ItemTypeFactory{
	private double price;
    //private double tax;
    public ItemTypeFactory(double price) {
        this.price = price;
    }
  
     public Double calcTax(String type) {
	   Item _item;
	   switch (type) {
       case "raw":
                 _item= new RawItem(this.price);
                 return _item.getterTax();
       case "manufactured":
    	   _item= new ManufacturedItem(this.price);
           return _item.getterTax();
       case "imported":
    	   _item= new ImportedItem(this.price);
           return _item.getterTax();
       default:
           return null;
   }
   }
  
}
