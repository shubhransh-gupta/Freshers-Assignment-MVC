import 'dart:io';
import 'package:dart_assignment1/component/Item.dart';
import 'package:dart_assignment1/component/ItemFactory.dart';
import 'BasicUtil.dart';

class InitPromptBarUtil{
  //displaying main promptbar bar to the user
  static void initPromptBar(){
        List<Item> items=[];
        var itemData=new Map();        
                int choice = 'n'.codeUnitAt(0);
                do {
                    print("Enter new item details:");
                    String? input = stdin.readLineSync();
                    List<String> inputArray = input!.split(" ");
                    itemData = BasicUtils.initDataStructureUtil(inputArray)!;
                    ItemFactory currentItem = new ItemFactory(itemData['name'],itemData['price'],itemData['quantity'],itemData['type']);
                    Item? item = currentItem.getItem();
                    items.add(item!);
                    print("Do you want to enter details of other items (y/n):");
                    choice = stdin.readLineSync()!.codeUnitAt(0);
                } while (choice == 'y'.codeUnitAt(0));
                BasicUtils.displayItemsUtil(items);
  }
}