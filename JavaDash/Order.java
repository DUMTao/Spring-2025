package JavaDash;
import java.util.*;

public class Order {
    private String orderId;
    private List<MenuItem> items = new ArrayList<>();
    private OrderStatus status;
    private Customer customer;
    private Restaurant restaurant;

    public void updateSatuts(OrderStatus status){

    }

    public double getTotal(){
        return //something
    }

    //All the getter methods for the order id's, items, status, customer and restaurant
    public String getOrderId(){
        return this.orderId;
    }

    public List<MenuItem> getItems(){
        return this.items;
    } 

    public OrderStatus getStatus(){
        return this.status;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public Restaurant getRestaurant(){
        return this.restaurant;
    }

}
