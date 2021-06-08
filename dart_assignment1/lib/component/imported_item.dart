import 'package:dart_assignment1/component/item_factory.dart';

import 'item.dart';

class ImportedItem extends Item {
  ImportedItem(String name, double price, int quantity, ItemType type)
      : super(name, price, quantity, type) {
    tax = 10.0 / 100 * price;
    if (tax <= 100) {
      tax += 5;
    } else if (tax >= 100 && tax <= 200) {
      tax += 10;
    } else {
      // 5 % of final cost which means original price + tax
      tax += 5.0 / 100 * (tax + price);
    }
  }
  //noSuchMethod(Invocation invocation) => super.noSuchMethod(invocation);
}
