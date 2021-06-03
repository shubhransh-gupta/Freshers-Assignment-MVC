class Item
{
    String? name;
    double? price;
    int? quantity;
    String? type;
  
    Item(String name,double price,int quantity,String Type)
    {
        this.name =name;
        this.price = price;
        this.quantity=quantity;
        type=Type;
    }

    void setPrice(double price)
    {
        this.price = price;
    }

    String? getName()
    {
        return name;
    }

    int? getQuantity()
    {
        return quantity;
    }

    double? getPrice()
    {
        return price;
    }

    String? getType()
    {
        return type;
    }
   
    double getTax() {
         return 0;
    }

    
}