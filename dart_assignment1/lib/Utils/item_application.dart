import 'dart:io';
import 'package:dart_assignment1/component/item.dart';
import 'package:dart_assignment1/component/item_factory.dart';
import 'basic_utils.dart';

class ItemApplication {
  //taking Input from the user
  static List<String>? _parseInputFromConsoleIntoArray() {
    print('Enter new item details:');
    //taking input from stdin console
    var input = stdin.readLineSync();
    //splitting the input based on  spaces
    var inputDataArray = input!.split(' ');
    return inputDataArray;
  }

  //displaying main promptbar bar to the user
  static void init() {
    var items = <Item>[];
    var choice = 'n'.codeUnitAt(0);
    do {
      var itemMap = {};
      var inputData = _parseInputFromConsoleIntoArray();
      //parse the given input into map
      itemMap = BasicUtils.parseInputIntoMap(inputData!)!;
      //call the itemfactory and demand the item object
      //add item in the Item Lists
      items.add(ItemFactory(itemMap['name'], itemMap['price'],
              itemMap['quantity'], itemMap['type'])
          .getItem()!);
      print('Do you want to enter details of other items (y/n):');
      choice = stdin.readLineSync()!.codeUnitAt(0);
    } while (choice == 'y'.codeUnitAt(0));
    BasicUtils.displayItemsUtil(items);
  }
}
