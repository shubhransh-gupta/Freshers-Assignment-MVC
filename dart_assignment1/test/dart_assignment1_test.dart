import 'package:dart_assignment1/component/Item.dart';
import 'package:test/test.dart';
import 'package:dart_assignment1/component/ItemFactory.dart';


void main() {
  //first create menu to prompt and ask input from the user 
  // create a class Item to explain how item will look
  
  //Testing Factory Design pattern 
  
  test('ItemFactoryTest', () {
    ItemFactory demandItem = new ItemFactory('Sony',2999,200,'imported');
    Item? item = demandItem.getItem();
    expect(item!.getType(),'imported');
  });

  test('ItemFactoryTest', () {
    ItemFactory demandItem = new ItemFactory('Boat',2999,200,'raw');
    Item? item = demandItem.getItem();
    expect(item!.getType(),'raw');
   
  });

  test('ItemFactoryTest', () {
    ItemFactory demandItem = new ItemFactory('Beats',2999,200,'manufactured');
    Item? item = demandItem.getItem();
    expect(item!.getType(),'manufactured');
  });

  //testing taxs value
  test('Testing the RequiredTax', () {
    ItemFactory demandItem = new ItemFactory('Beats',2999,200,'manufactured');
    Item? item = demandItem.getItem();
    expect(item!.getTax(),442.3525);
  });
  test('Testing the RequiredTax', () {
    ItemFactory demandItem = new ItemFactory('Boat',2999,200,'raw');
    Item? item = demandItem.getItem();
    expect(item!.getTax(),374.875);
  });
  test('Testing the RequiredTax', () {
    ItemFactory demandItem = new ItemFactory('Sony',2999,200,'imported');
    Item? item = demandItem.getItem();
    expect(item!.getTax(),464.845);
  });
  test('Veryfying Item', () {
    ItemFactory demandItem = new ItemFactory('Sony',2999,200,'imported');
    Item? item = demandItem.getItem();
    expect(item!.getName(),'Sony');
    expect(item.getPrice(),2999);
    expect(item.getQuantity(),200);
  });
  test('Veryfying Item', () {
    ItemFactory demandItem = new ItemFactory('Beats',2999,200,'imported');
    Item? item = demandItem.getItem();
    expect(item!.getName(),'Beats');
    expect(item.getPrice(),2999);
    expect(item.getQuantity(),200);
  });
  test('Veryfying Item', () {
    ItemFactory demandItem = new ItemFactory('Apple',2999,200,'imported');
    Item? item = demandItem.getItem();
    expect(item!.getName(),'Apple');
    expect(item.getPrice(),2999);
    expect(item.getQuantity(),200);
  });
/*
  test('Displaying output', () {
    List<Item>items=[];
    ItemFactory demandItem = new ItemFactory('Apple',2999,200,'imported');
    Item? item = demandItem.getItem();
    items.add(item!);
    BasicUtils.displayItems(items);
    
  });*/

}
