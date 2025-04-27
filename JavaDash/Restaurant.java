package JavaDash;
import java.util.*;

public class Restaurant {
    private String name;
    private String address;
    private List<MenuItem> items = new ArrayList<>();
    
    public void addMenuItem(MenuItem item){
        items.add(item);
    }

    public List<MenuItem> getMenu(){
        return this.items;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }
}
