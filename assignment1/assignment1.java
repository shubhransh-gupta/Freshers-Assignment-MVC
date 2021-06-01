package assignment1;

import java.util.ArrayList;
import java.util.Scanner;
import assignment1.models.Item;
import assignment1.util.DisplayUtil;
public class Assignment1 {
	public static void main(String[] args) {
		// TODO ArrayList of Items containing all the individual items
		// Taking input from the user and adding it to items ArrayList by splitting all args 
		// to the respective variables of the class Item
        ArrayList<Item> items = new ArrayList<Item>();     
        Scanner scanner =new Scanner(System.in);
        char choice='n';
        do {
        	System.out.println("Enter new item details:");
        	String input=scanner.next();
        	input+=scanner.nextLine();
        	String inputArray[]=input.split(" ");
        	Item currentItem = new Item();
        	currentItem.getItemDetails(inputArray);
        	items.add(currentItem);
        	System.out.println("Do you want to enter details of other items (y/n):");
        	choice=scanner.next().charAt(0);
           } while(choice=='y');
        DisplayUtil.display(items);
        scanner.close();
	}

}