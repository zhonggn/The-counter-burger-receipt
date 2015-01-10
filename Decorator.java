package composite;

import java.util.ArrayList;

public class Decorator implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private double price;
    public Decorator ( Component c )
    {
        components = c.getAllChildren();
        price = c.getPrice();
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
	
	public String getDescription(){
	    return description;
	}
	public ArrayList<Component> getAllChildren(){
	    return components;
	}
	public double getPrice(){
	   return price;
	}
}
 
