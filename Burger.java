package composite;
import java.util.*;
import java.util.ArrayList;

public class Burger implements Component {
    private String[] burgerOp = {"Hormone & Antibiotic Free Beef*", "100% Natural Chicken Breast",
                                 "100% Natural Ground Turkey", "Housemade Vegan Veggie", "Organic Bison*", "Ahi Tuna*",
                                 "1/3lb.", "1/2lb.", "1lb.", "On A Bun", "In A Bowl", "Seasonal Lettuce Blend", 
                                 "Organic Mixed Greens", "Baby Spinach", "Kale", "Quinoa"};
    private ArrayList<Component> components = new ArrayList<Component>();
    
    private String description ;
    private double price = 0.00;
    public Burger ( ArrayList<Component> c )
    {
        components = c ;
       String burgerDes = "";
       
        for(Iterator<Component> it = components.iterator(); it.hasNext();){
            Component obj = it.next();
            String des = obj.getDescription();
            if(Arrays.asList(burgerOp).contains(des)){
                if(des == "1/3lb.") price += 9;
                else if(des == "1/2lb.") price += 12;
                else if(des == "1lb.") price += 18;
                else if(des == "In A Bowl") price += 1;
                else if(des == "Organic Bison*"|| des == "AhiTuna*") price += 4;
                burgerDes += (" + "+des);
               
                it.remove();
            }
        }
        
        
        if(burgerDes.length() >2)
            burgerDes = burgerDes.substring(2);
        this.addChild(new Leaf(burgerDes));
        
    }

    
    public void printDescription() {
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
     
    public ArrayList<Component> getAllChildren() {
        return components;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getDescription(){
       return description;
    }
}
 
