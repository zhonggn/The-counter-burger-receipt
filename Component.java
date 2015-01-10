package composite;

import java.util.*;
public interface Component {

     void printDescription() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     public String getDescription();
     public ArrayList<Component> getAllChildren();
     public double getPrice();
}
 
