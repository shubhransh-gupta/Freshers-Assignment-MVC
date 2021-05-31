package assignment1.util;
import assignment1.models.Item;
import java.util.ArrayList;



public class Displayclass {
	public static void display(ArrayList<Item> _items) {
    	for(int i=0;i<_items.size();i++) {
    		Item item=_items.get(i);
    		if(item.getType()=="") {
        		System.out.println("Type field is missing!");
        		continue;
        	}
    		if(item.getName()=="") {
    			System .out.println("Name not entered!");
    		}
    		else {
    			System.out.println("Item name : "+item.getName());
    		}
    		System.out.println("Item price : "+item.getPrice());
    		System.out.println("Tax per item : "+item.getTax());
    		System.out.println("Total price is : "+(item.getPrice()+item.getTax()));
    	}
    }
}
