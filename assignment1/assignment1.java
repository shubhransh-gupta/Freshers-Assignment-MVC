package assignment1;

import java.util.ArrayList;
import java.util.Scanner;
import assignment1.models.Item;
import assignment1.util.Displayclass;
public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Item> items = new ArrayList<Item>();
     
        Scanner in =new Scanner(System.in);
        char choice='n';
        do {
        	System.out.println("Enter new item details:");
        	String input=in.next();
        	input+=in.nextLine();
        	String inparr[]=input.split(" ");
        	Item currentItem = new Item();
        	currentItem.getItemDetails(inparr);
        	items.add(currentItem);
        	System.out.println("Do you want to enter details of other items (y/n):");
        	choice=in.next().charAt(0);
        } while(choice=='y');
        Displayclass.display(items);
	}

}