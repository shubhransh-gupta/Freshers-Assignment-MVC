import 'ImportedItem.dart';
import 'Item.dart';
import 'ManufacturedItem.dart';
import 'RawItem.dart';

class ItemFactory {   
    late String name;
    late double price;
    late int quantity;
    late String Type;

    ItemFactory(String name,double price,int quantity,String Type)
    {
        this.name =name;
        this.price = price;
        this.quantity=quantity;
        this.Type=Type;
    }
    //return Item Object as per the type
    Item? getItem(){   
        String type = Type;
        switch (type) {
            case 'raw': RawItem tempItem = RawItem(name, price, quantity, Type);
                return tempItem;
                 
            case 'manufactured': ManufacturedItem tempItem = ManufacturedItem(name,price,quantity,Type);
                 return tempItem;
                
            case 'imported': ImportedItem tempItem= ImportedItem(name,price,quantity,Type);
                return tempItem;
                // ignore: dead_code
                
        }
    }
}