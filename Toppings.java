package composite;
import java.util.*;

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toppings extends Decorator
{
    // instance variables - replace the example below with your own
    private String[] Op = {"Dill Pickle Chips","Carrot Strings","Alfalfa Sprouts","Onion Confit",
                           "Organic Mixed Greens","Pickled Carrots and Daikon","Jicama", "Kale",
                           "Sliced Cucumbers","Fresh Jalapenos", "Grilled Pineapple", "Roasted Corn & Black Bean Salsa",
                           "Spicy Pepperoncinis","Scallions","Coleslaw","Roasted Red Peppers",
                           "Black Olives","Sliced Red Onion","Dried Cranberries","Quinoa",
                           "Spicy Pickles","Baby Spinach","Hard Boiled Eggs","Housemade Garlic Croutons",
                           "Seasonal Lettuce Blend","Ripened Red Tomatoes","Roasted Green Chiles","Crushed Peanuts"};
    private ArrayList<Component> components = new ArrayList<Component>();
    private int counter = 0;
    
    /**
     * Constructor for objects of class Cheese
     */
    public Toppings(Component c)
    {
        super(c);
    }
    
    public ArrayList<Component> getAllChildren(){
        components = super.getAllChildren();
        //return setOption(components);
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
        //if(counter>4) 
         //   price += 0.75*(counter-4);
        return price;
        
    }
}
