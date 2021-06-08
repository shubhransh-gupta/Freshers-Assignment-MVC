import 'package:dart_assignment1/component/item_factory.dart';
import 'item.dart';

class RawItem extends Item {
  RawItem(String name, double price, int quantity, ItemType type)
      : super(name, price, quantity, type) {
    tax = ((12.5 / 100) * price);
  }
}
