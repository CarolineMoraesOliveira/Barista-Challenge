

public class TestBarista {

    public static void main(String[] args) {
 
    System.out.println("----- 1 -----");
    // Menu

    Item item1 = new Item("cappuccino", 4.50);
    Item item2 = new Item("drip coffee", 2.30);
    Item item3 = new Item("mocha", 3.50);
    Item item4 = new Item("vietnamese coffee", 5.20);

    System.out.println("----- 2 -----");
    // Create 2 orders for unspecified guests. Do not specify a name.

    Order order1 = new Order();
    Order order2 = new Order();

    System.out.println("----- 3 -----");
    // Create 3 orders using the overloaded constructor to give each a name for the order.

    Order order3 = new Order("Sam");
    Order order4 = new Order("Noah");
    Order order5 = new Order("Cindhury");

    System.out.println("----- 4 -----");
    // Add at least 2 items to each of the orders using the addItem method.

    order1.addItem(item4);
    order1.addItem(item3);

    order2.addItem(item2);
    order2.addItem(item1);

    order3.addItem(item1);
    order3.addItem(item2);

    order4.addItem(item4);
    order4.addItem(item4);

    order5.addItem(item3);
    order5.addItem(item3);

    System.out.println("----- 5 -----");
    // Test your getStatusMessage method by setting some orders to ready and printing the messages for each order.

    System.out.println(order1.getStatusMessage());
    order1.setReady(true);
    System.out.println(order1.getStatusMessage());
    order2.setReady(true);
    System.out.println(order2.getStatusMessage());

    System.out.println("----- 6 -----");
    // Test the total by printing the return value like so: 'System.out.println(order1.getOrderTotal())'.

    System.out.println(order1.getOrderTotal());
    System.out.println(order2.getOrderTotal());
    System.out.println(order3.getOrderTotal());
    System.out.println(order4.getOrderTotal());
    
    System.out.println("----- 7 -----");
    // Finally, call the display method on all of your orders.

    order1.displayAllInformation();
    order3.displayAllInformation();

}
}