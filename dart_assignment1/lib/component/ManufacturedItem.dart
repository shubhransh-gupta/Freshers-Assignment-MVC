import 'Item.dart';

class ManufacturedItem extends Item {
    late double tax;
    late String itemType;

    ManufacturedItem(String name,double price,int quantity,String Type) : super(name, price, quantity,Type){
        
        itemType=Type;
        tax = 12.5 / 100 * price; 
        tax += 2.0 / 100 * (price + tax);
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