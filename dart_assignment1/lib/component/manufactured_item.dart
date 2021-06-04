import 'package:dart_assignment1/component/item_factory.dart';
import 'Item.dart';

class ManufacturedItem extends Item {
    late double mtax;
    ManufacturedItem(String name,double price,int quantity,ItemType type) : super(name, price, quantity,type){
       
        mtax = 12.5 / 100 * price; 
        mtax += 2.0 / 100 * (price + mtax);
        tax=mtax;
    }
    //noSuchMethod(Invocation invocation) => super.noSuchMethod(invocation);
}