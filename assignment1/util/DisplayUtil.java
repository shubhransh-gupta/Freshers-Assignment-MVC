package assignment1.util;
import assignment1.models.Item;
import java.util.ArrayList;

public class DisplayUtil {
	public static void display(ArrayList<Item> items) 
	{
		// Iterating over the ArrayList and displaying all the Item Variables if it have.
    	for(int i=0;i<items.size();i++) 
    	{
    		Item item=items.get(i);
    		if(item.getType()=="") 
    		{
        		System.out.println("Type field is missing!");
        		continue;
        	}
    		if(item.getName()=="") 
    		{
    			System .out.println("Name not entered!");
    		}
    		else 
    		{
    			System.out.println("Item name : "+item.getName());
    		}
    		System.out.println("Item price : "+item.getPrice());
    		System.out.println("Tax per item : "+item.getTax());
    		System.out.println("Total price is : "+(item.getPrice()+item.getTax()));
    	}
    }
}
