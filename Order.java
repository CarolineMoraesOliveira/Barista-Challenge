import java.util.ArrayList;

public class Order {


    // Member variables

    private String name;
    private boolean ready;
    private ArrayList <Item> items;


    // Constructor

    public Order (){
        this.name = "Guest";
        this.items = new ArrayList();
    }

    // Overloaded Constructor

    public Order (String name){
        this.name = name;
        this.items = new ArrayList();
    }

    // Creating Getters and Setters for all the member variables (attributes)

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    // Order Methods
        // 1. Method to addItems to an Order

    public void addItem(Item item){
        items.add(item);
    }

        // 2. Method to getStatusMessage from an Order

    public String getStatusMessage(){
        if (this.ready){
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";  
        }
    }

        // 3. Method to GetOrderTotal by adding all the item's prices(all of them are stored at Item class);

    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

        // 4. Method to displayMenu: Customer Name: name, item - price, item - price, OrderTotal
    
    public void displayAllInformation(){
        System.out.println("Customer Name: "+this.name);
        for(Item item : items){
            System.out.println(item.getName()+" - $"+item.getPrice());
        }
        System.out.println("Total: $"+getOrderTotal());
    }


}