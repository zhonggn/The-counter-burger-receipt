package composite;

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private double price;
    public Composite ( String d )
    {
        description = d ;
    }

	public void printDescription() {
	    
        
        this.setOption();
        if(price>0)
        description += " "+ String.valueOf(price);
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
	
	public void setOption(){
	    Component myBurger = new Side(new Bun(new PremiumTopping(new Toppings(new Sauce(new PremiumCheese(new Cheese(new Burger(components))))))));
	    components = myBurger.getAllChildren();
	    price = myBurger.getPrice();
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
 
