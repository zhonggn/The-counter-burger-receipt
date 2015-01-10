package composite;
import java.util.*;

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumTopping extends Decorator
{
    // instance variables - replace the example below with your own
    private String[] Op = {"Sunny Side Up Egg*","Black Forest Ham", "Grilled Red Onion","Sliced Avocado",
                           "Marinated Artichokes","Grilled Anaheim Peppers","Housemade Guacamole","Sun-Dried Tomatoes",
                           "Olive Tapenade","Crispy Onion Strings","Applewood Smoked Bacon","Smocked Pickled Jalapenos",
                           "Fried Pickle Chips","Sauteed Mushrooms","Oven Roasted Tomatoes","Housemade Chili",
                           "Marinated Tomatoes","Housemade Turkey Chili"};
    private ArrayList<Component> components = new ArrayList<Component>();
    private int counter = 0;//record the count of all Premium Toppings.
    private double PreToppingPrice=0;
    /**
     * Constructor for objects of class Cheese
     */
    public PremiumTopping(Component c)
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
                if(des == "Marinated Tomatoes"){
                    PreToppingPrice += 3;
                }else{
                    PreToppingPrice += 1;
                }
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
        
            price += PreToppingPrice;
        return price;
        
    }
}
