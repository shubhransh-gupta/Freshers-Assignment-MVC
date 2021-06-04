import 'dart:io';
import 'package:dart_assignment1/component/Item.dart';
import 'package:dart_assignment1/component/item_factory.dart';
import 'BasicUtil.dart';

class ItemApplication {
  //taking Input from the user
  static List<String>? takeInputFromConsole() {
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
      var inputData = takeInputFromConsole();
      //parse the given input into map
      itemMap = BasicUtils.parseInputIntoMap(inputData!)!;
      //call the itemfactory and demand the item object
      var currentItem = ItemFactory(itemMap['name'], itemMap['price'],itemMap['quantity'], itemMap['type']);
      var item = currentItem.getItem();
      //add item in the Item Lists
      items.add(item!);
      print('Do you want to enter details of other items (y/n):');
      choice = stdin.readLineSync()!.codeUnitAt(0);
    } while (choice == 'y'.codeUnitAt(0));
    BasicUtils.displayItemsUtil(items);
  }
}
