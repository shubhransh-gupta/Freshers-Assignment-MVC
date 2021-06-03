import 'Item.dart';

class RawItem extends Item {
    late double tax;
    late String itemType;
    RawItem(String name,double price,int quantity,String Type) : super(name, price, quantity,Type){
        
        itemType=Type;
        tax = ((12.5 / 100) * price);
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