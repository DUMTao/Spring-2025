package JavaDash;
import java.util.*;

public class Customer {
    private String username;
    private String address;
    private List<Order> orderHistory = new ArrayList<Order>();
    private Cart cart;
    
    public void addToCart(MenuItem item){

    }

    public Order placeOrder(){

    }

    public List<Order> viewOrderHistory(){

    }

    public String getName(){
        return this.username;
    }

    public String getAddress(){
        return this.address;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

}
