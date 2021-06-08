import 'package:dart_assignment1/component/item.dart';
import 'package:test/test.dart';
import 'package:dart_assignment1/component/item_factory.dart';

void main() {
  //first create menu to prompt and ask input from the user
  // create a class Item to explain how item will look

  //Testing Factory Design pattern
  group('ItemFactory Test', () {
    test('Test for Imported Item', () {
      var demandItem = ItemFactory('Sony', 2999, 200, ItemType.imported);
      var item = demandItem.getItem();
      expect(item!.type, ItemType.imported);
    });

    test('Test for Raw Item', () {
      var demandItem = ItemFactory('Boat', 2999, 200, ItemType.raw);
      var item = demandItem.getItem();
      expect(item!.type, ItemType.raw);
    });

    test('Test for Manufactured Item', () {
      var demandItem = ItemFactory('Beats', 2999, 200, ItemType.manufactured);
      var item = demandItem.getItem();
      expect(item!.type, ItemType.manufactured);
    });
  });

  //testing taxs value
  group('Testing the RequiredTax', () {
    test('RequiredTax for Manufactured Item', () {
      var demandItem = ItemFactory('Beats', 2999, 200, ItemType.manufactured);
      // ignore: omit_local_variable_types
      Item? item = demandItem.getItem();
      expect(item!.tax, 442.3525);
    });
    test('RequiredTax for Raw Item', () {
      var demandItem = ItemFactory('Boat', 2999, 200, ItemType.raw);
      var item = demandItem.getItem();
      expect(item!.tax, 374.875);
    });
    test('RequiredTax for Imported Item', () {
      var demandItem = ItemFactory('Sony', 2999, 200, ItemType.imported);
      var item = demandItem.getItem();
      expect(item!.tax, 464.845);
    });
  });

  group('Testing Inheritance for different items', () {
    test('Test for Imported Item', () {
      var demandItem = ItemFactory('Sony', 2999, 200, ItemType.imported);
      var item = demandItem.getItem();
      expect(item!.name, 'Sony');
      expect(item.price, 2999);
      expect(item.quantity, 200);
    });
    test('Test for Raw Item', () {
      var demandItem = ItemFactory('Beats', 2999, 200, ItemType.raw);
      var item = demandItem.getItem();
      expect(item!.name, 'Beats');
      expect(item.price, 2999);
      expect(item.quantity, 200);
    });
    test('Test for Manufactured Item', () {
      var demandItem = ItemFactory('Apple', 2999, 200, ItemType.manufactured);
      var item = demandItem.getItem();
      expect(item!.name, 'Apple');
      expect(item.price, 2999);
      expect(item.quantity, 200);
    });
  });

}
