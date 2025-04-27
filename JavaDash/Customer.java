package JavaDash;
import java.util.*;

public class Customer {
    private String username;
    private String address;
    private List<Order> orderHistory = new ArrayList<Order>();
    private Cart cart;
    
    public void addToCart(MenuItem item){
        if (cart == null){
            cart = new Cart();
        }
        cart.addItem(item);
    }

    public Order placeOrder(){
        if (cart == null){
            return null;
        }
        
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
