import 'dart:io';
import 'package:dart_assignment1/component/Item.dart';
class BasicUtils{    
  //conveting console input into data structure
  static Map? initDataStructureUtil(List<String> args)
    {   
      var itemData = new Map();
      //iterating over the console input args and set the required DataStructure
        for (var i = 0; i < args.length; i++) {
            try {
                if (((('-name'.compareTo(args[i]) == 0) && ('-type'.compareTo(args[i + 1]) != 0)) && ('-price'.compareTo(args[i + 1]) != 0)) && ('-quantity'.compareTo(args[i + 1]) != 0)) {
                    itemData['name']= args[i + 1];
                    i = (i + 1);
                }
            } on FormatException catch (e) {
                print('Value not entered!');
                exit(0);
            }
            try {
                if (((('-price'.compareTo(args[i]) == 0) && ('-type'.compareTo(args[i + 1]) != 0)) && ('quantity'.compareTo(args[i + 1]) != 0)) && ('-name'.compareTo(args[i + 1]) != 0)) {
                    try {
                        itemData['price']= (double.parse(args[i + 1]));
                        i = (i + 1);
                    } on FormatException catch (e) {
                        print('Invalid Input!');
                        exit(0);
                    }
                }
            } on FormatException catch (e) {
                print('Some Value(s) are missing !');
                exit(0);
            }
            try {
                if (((('-quantity'.compareTo(args[i]) == 0) && ('-type'.compareTo(args[i + 1]) != 0)) && ('-price'.compareTo(args[i + 1]) != 0)) && ('-name'.compareTo(args[i + 1]) != 0)) {
                    try {
                        itemData['quantity']= int.parse(args[i + 1]);
                        i = (i + 1);
                    } on FormatException catch (e) {
                        print('Invalid Input!');
                        exit(0);
                    }
                }
            } on FormatException catch (e) {
                print('Value not entered!');
                exit(0);
            }
            try {
                if (((('-type'.compareTo(args[i]) == 0) && ('-price'.compareTo(args[i + 1]) != 0)) && ('-quantity'.compareTo(args[i + 1]) != 0)) && ('-name'.compareTo(args[i + 1]) != 0)) {
                    itemData['type']=(args[i + 1]);
                    i = (i + 1);
                }
            } on FormatException catch (e) {
                print('Some Value(s) are missing !');
                exit(0);
            }
        }
        return itemData ;
    }
    //display function to print final output on screen
    static void displayItemsUtil(List<Item> items)
    {
        for (var i = 0; i < items.length; i++) {
            var item = items[i];
            if (item.getType()=='') {
              print('Type field is missing!');
              continue;
            }
            if (item.getName() == '') {
              print('Name not entered!');
            } else {
              print('Item name : ' + item.getName()!);
            }
              print('Item price : ${item.getPrice()}');
              print('Tax per item : ${item.getTax()}');
              var totalOutput = item.getPrice()! + item.getTax();
              print('Total price is : $totalOutput');
        }
    }
}
