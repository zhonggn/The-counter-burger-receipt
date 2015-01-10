package composite;
import java.util.*;

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends Decorator
{
    // instance variables - replace the example below with your own
    private String[] Op =  {"Red Relish", "Horseradish Aioli", "Smoky Chipotle Aioli","Roasted Garlic Aioli",
                            "Housemade Tzatziki Sauce","House Mustard", "Spicy Worcestershire",
                            "Apricot Sauce", "Hot Wing Sauce", "Signature Steak Sauce","Spicy Sour Cream",
                            "Tangy Thousand Island","Hickory BBQ Sauce", "Mayonnaise","Thai Peanut Sauce",
                            "Sweet Sriracha","Habanero Salsa","Basil Pesto","Creamy Caesar","Country Buttermilk Ranch",
                            "Honey Dijon","Lemon Vinaigrette","Dijon Balsamic Dressing",
                            "Sesame Ginger Dressing", "Sun-Dired Tomato Vinaigrette","Nori-soy Sauce"};  
    private ArrayList<Component> components = new ArrayList<Component>();
    private int counter = 0;
    
    /**
     * Constructor for objects of class Cheese
     */
    public Sauce(Component c)
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
        if(counter>1)
            price += 0.5*(counter-1);
        return price;
        
    }
}
