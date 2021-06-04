import 'package:dart_assignment1/component/item_factory.dart';

import 'Item.dart';

class ImportedItem extends Item {
  late double itax;

  ImportedItem(String name, double price, int quantity, ItemType type)
      : super(name, price, quantity, type) {
    itax = 10.0 / 100 * price;
    if (itax <= 100) {
      itax += 5;
    } else if (itax >= 100 && itax <= 200) {
      itax += 10;
    } else {
      // 5 % of final cost which means original price + tax
      itax += 5.0 / 100 * (itax + price);
      tax = itax;
    }
  }
  //noSuchMethod(Invocation invocation) => super.noSuchMethod(invocation);
}
