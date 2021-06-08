import 'package:dart_assignment1/component/item_factory.dart';
import 'item.dart';

class ManufacturedItem extends Item {
  ManufacturedItem(String name, double price, int quantity, ItemType type)
      : super(name, price, quantity, type) {
    tax = 12.5 / 100 * price;
    tax += 2.0 / 100 * (price + tax);
  }
  //noSuchMethod(Invocation invocation) => super.noSuchMethod(invocation);
}
