package composite;
import java.util.*;
import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    private Double price = -1.00;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    public Leaf (String d){
        description = d;
    }
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        if(price == -1) System.out.println(description);
        else System.out.println( description + " " + fmt.format(price) ) ;
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
	public String getDescription(){
	    return description;
	}
	public ArrayList<Component> getAllChildren(){
	    return null;
	}
	public double getPrice(){
	    return price;
	}
}
 
