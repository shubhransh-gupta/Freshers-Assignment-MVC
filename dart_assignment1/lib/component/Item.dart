import 'dart:core';
import 'package:dart_assignment1/component/item_factory.dart';

abstract class Item
{
    String? _name;
    double? _price;
    int? _quantity;
    ItemType? _type;
    double? _tax;
  
    Item(String name,double price,int quantity,ItemType type)
    {
        _name =name;
        _price = price;
        _quantity=quantity;
        _type=type;
    }
    set tax(tax)=> _tax=tax;

    String? get name=> _name;

    int? get quantity => _quantity;

    double? get price => _price;

    ItemType? get type => _type;

    double? get tax=> _tax; 
}