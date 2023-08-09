public class Item {

    // Member variables 

    private String name; 
    private double price;

    // Constructor

    public Item (String name, double price){
        this.name = name;
        this.price = price;
    }

    // Create getters and setters for all the member variables.

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
