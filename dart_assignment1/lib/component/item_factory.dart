import 'ImportedItem.dart';
import 'Item.dart';
import 'ManufacturedItem.dart';
import 'RawItem.dart';

enum ItemType { raw, manufactured, imported }

class ItemFactory {
  late String name;
  late double price;
  late int quantity;
  late ItemType type;

  ItemFactory(String name, double price, int quantity, ItemType type) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.type = type;
  }
  //return Item Object as per the type
  Item? getItem() {
    switch (type) {
      case ItemType.raw:
        return RawItem(name, price, quantity, type);
      case ItemType.manufactured:
        return ManufacturedItem(name, price, quantity, type);
      case ItemType.imported:
        return ImportedItem(name, price, quantity, type);
      // ignore: dead_code

    }
  }
}
