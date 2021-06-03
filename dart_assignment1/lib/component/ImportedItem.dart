import 'Item.dart';

class ImportedItem extends Item {
     late double tax;
     late String itemType;
      ImportedItem(String name,double price,int quantity,String Type) : super(name, price, quantity,Type){
      itemType=Type;
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

    @override
    double getTax(){
     return tax;
    }
    @override
    String? getType(){
     return itemType;
    }
    noSuchMethod(Invocation invocation) => super.noSuchMethod(invocation);
}