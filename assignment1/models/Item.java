package assignment1.models;

public class Item  {
	private String name;
	private double price;
	private int quantity;
	private Double tax;
	private String type;
	 public Item() {
		 
	 }
	 public Item(double price) {
	        this.price = price;
	        
	     // TODO Auto-generated constructor stub
		}
	 public void setTax(String type) {
		    this.type=type;
			ItemTypeFactory ip = new ItemTypeFactory(this.price);
			Double tax = ip.calcTax(type);
			if(tax==null) {
			System.out.println("Type is null or not in boundaries");
			}			
			this.tax=tax;
		}
     public void setPrice(double price) {
			this.price = price;
		}
     public Double getterTax() {
     	return null;
     }
   public String getName() {
        return this.name;
    }
   public int getQuantity() {
       return this.quantity;
   }
    public double getPrice() {
        return this.price;
    }
   public String getType() {
	   return this.type;
   }
    
    //should be override
    public Double getTax() {
    	return tax;
    }
    public void getItemDetails(String[] args) {
    	for(int i=0;i<args.length;i++) {
    		//check for fields if have correct values 
    		try {
    			if("-name".compareTo(args[i])==0 && "-type".compareTo(args[i+1])!=0 && "-price".compareTo(args[i+1])!=0 && "-quantity".compareTo(args[i+1])!=0) {
    				this.name=args[i+1];
    				i=i+1;
    			}
    		} catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println("Value not entered!");
    			System.exit(0);
    		}
       		try {
    			if("-price".compareTo(args[i])==0 && "-type".compareTo(args[i+1])!=0 && "quantity".compareTo(args[i+1])!=0 && "-name".compareTo(args[i+1])!=0) {
    				try {
    					setPrice(Double.parseDouble(args[i+1]));
    					i=i+1;
    				} catch (NumberFormatException e) {
    					System.out.println("Invalid Input!");
    					System.exit(0);
    				}
    			}
    		} catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println("Some Value(s) are missing !");
    			System.exit(0);
    		}
    		try {
    			if("-quantity".compareTo(args[i])==0 && "-type".compareTo(args[i+1])!=0 && "-price".compareTo(args[i+1])!=0 && "-name".compareTo(args[i+1])!=0) {
    				try {
    					this.quantity=Integer.parseInt(args[i+1]);
    					i=i+1;
    				} catch (NumberFormatException e) {
    					System.out.println("Invalid Input!");
    					System.exit(0);
    				}
    			}
    		} catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println("Value not entered!");
    			System.exit(0);
    		}
    		try {
    			if("-type".compareTo(args[i])==0 && "-price".compareTo(args[i+1])!=0 && "-quantity".compareTo(args[i+1])!=0 && "-name".compareTo(args[i+1])!=0) {
    				setTax(args[i+1]);
    				i=i+1;
    			}
    		} catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println("Some Value(s) are missing !");
    			System.exit(0);
    		}
    	}
    
    }
    
    
}
