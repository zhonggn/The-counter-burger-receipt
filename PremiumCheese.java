package composite;
import java.util.*;

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends Decorator
{
    // instance variables - replace the example below with your own
    private String[] Op = {"Danish Blue Cheese", "Fresh Mozzarella", "Gruyere", "Soft-Ripened Brie", "Vegan Cheddar",
                           "Manchego", "Herbed Goat Cheese", "Spread"};
    private ArrayList<Component> components = new ArrayList<Component>();
    private int counter = 0;
    
    /**
     * Constructor for objects of class Cheese
     */
    public PremiumCheese(Component c)
    {
        super(c);
    }
    
    public ArrayList<Component> getAllChildren(){
        components = super.getAllChildren();
        
        String Des = "";
        
        for(Iterator<Component> it = components.iterator(); it.hasNext();){
            Component obj = it.next();
            String des = obj.getDescription();
            if(Arrays.asList(Op).contains(des)){
                
                Des += (" + "+des);
               
                it.remove();
               counter++;
            }
        }
        
       
        if(Des.length() >2)
            Des = Des.substring(2);
        components.add(new Leaf(Des));
        return components;
    }
    
    public double getPrice(){
        double price = super.getPrice();
        price += 1.5*counter;
        return price;
        
    }
}
