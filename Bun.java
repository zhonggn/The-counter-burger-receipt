package composite;
import java.util.*;

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bun extends Decorator
{
    // instance variables - replace the example below with your own
    private String[] Op =  {"Brioche Style Bun","Gluten-Free Bun","Multigrain Bun","Pretzel Bun",
                            "Ciabatta(Vegan)","Hawaiian Bun","English Muffin"};  
    private ArrayList<Component> components = new ArrayList<Component>();
    private int counter = 0;
    private double BunPrice = 0;
    /**
     * Constructor for objects of class Cheese
     */
    public Bun(Component c)
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
                if(des == "Gluten-Free Bun"||des == "Hawaiian Bun") BunPrice += 1;
                else if(des == "Pretzel Bun") BunPrice += 0.5;
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
        
            price += BunPrice;
        return price;
        
    }
}
