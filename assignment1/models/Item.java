package assignment1.models;
//define class Item with its respective variables as given in the problem statement
public class Item  {
	private String name;
	private double price;
	private int quantity;
	private Double tax;
	private String type;
	public Item() 
	{
		    //default constructor
	}
	public Item(double price)
	{       
		    // TODO Specialized constructor for child classes
	        this.price = price;	        
	}
	public void setTax(String type) 
	{       //this will calculate and set the tax based on the item type, context of factory design pattern 
		    this.type=type;
		    //context of Factory Design pattern 
			ItemTypeFactory itemFactory = new ItemTypeFactory(this.price);
			Double tax = itemFactory.calcTax(type);
			if(tax==null) 
			{
			   System.out.println("Type is null or not in boundaries");
			}			
			this.tax=tax;
	}
    public void setPrice(double price) 
    {
			this.price = price;
	}
    public Double fetchingTax() 
    {
     	    return null;
    }
    public String getName() 
    {
            return this.name;
    }
    public int getQuantity() 
    {
    		return this.quantity;
    }
    public double getPrice() 
    {
        	return this.price;
    }
    public String getType() 
    {
    		return this.type;
    }      
    public Double getTax() 
    {
    		return tax;
    }
    public void getItemDetails(String[] args) 
    {
    		for(int i=0;i<args.length;i++) 
    		{
    		//check fields if they have correct values or else throwing exception as stated in problem statement  
    			try {
    					if("-name".compareTo(args[i])==0 && "-type".compareTo(args[i+1])!=0 && "-price".compareTo(args[i+1])!=0 && "-quantity".compareTo(args[i+1])!=0) {
    						this.name=args[i+1];
    						i=i+1;
    					}
    				} 
    			catch (ArrayIndexOutOfBoundsException e) 
    			{
    					System.out.println("Value not entered!");
    					System.exit(0);
    			}
    			try {
    				if("-price".compareTo(args[i])==0 && "-type".compareTo(args[i+1])!=0 && "quantity".compareTo(args[i+1])!=0 && "-name".compareTo(args[i+1])!=0) {
    					try {
    							setPrice(Double.parseDouble(args[i+1]));
    							i=i+1;
    						} 
    						catch (NumberFormatException e) 
    					    {
    							System.out.println("Invalid Input!");
    							System.exit(0);
    					    }
    					}
    				} 
    			catch (ArrayIndexOutOfBoundsException e) 
    			{
    					System.out.println("Some Value(s) are missing !");
    					System.exit(0);
    			}
    		    try {
    			   if("-quantity".compareTo(args[i])==0 && "-type".compareTo(args[i+1])!=0 && "-price".compareTo(args[i+1])!=0 && "-name".compareTo(args[i+1])!=0) {
    				    try {
    					   		this.quantity=Integer.parseInt(args[i+1]);
    					   		i=i+1;
    				   	    } 
    				    catch (NumberFormatException e) 
    				    {
    					   		System.out.println("Invalid Input!");
    					   		System.exit(0);
    				    }
    			    }
    		       } 
    		    catch (ArrayIndexOutOfBoundsException e) 
    		    {
    			   	    System.out.println("Value not entered!");
    			   		System.exit(0);
    		    }
    		    try 
    		    {
    		    	if("-type".compareTo(args[i])==0 && "-price".compareTo(args[i+1])!=0 && "-quantity".compareTo(args[i+1])!=0 && "-name".compareTo(args[i+1])!=0) {
    		    		setTax(args[i+1]);
    		    		i=i+1;
    		    	}
    		    } 
    		    catch (ArrayIndexOutOfBoundsException e) 
    		    {
    		    	System.out.println("Some Value(s) are missing !");
    		    	System.exit(0);
    		    }
    	   }    
    }  
    
}
