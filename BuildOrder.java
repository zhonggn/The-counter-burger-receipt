package composite;

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Your Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));
        Composite customBurger1 = new Composite( "Build Your Own Burger" ) ;
        customBurger1.addChild(new Leaf("Organic Bison*" )); 
        customBurger1.addChild(new Leaf("1/2lb." ));
        customBurger1.addChild(new Leaf("On A Bun"));
        customBurger1.addChild(new Leaf("Yellow American")); 
        customBurger1.addChild(new Leaf("Spicy Jalapeno Jack" )); 
        customBurger1.addChild(new Leaf("Danish Blue Cheese" )); 
        customBurger1.addChild(new Leaf("Thai Peanut Sauce")); 
        customBurger1.addChild(new Leaf("Mayonnaise")); 
        customBurger1.addChild(new Leaf("Dill Pickle Chips")); 
        customBurger1.addChild(new Leaf("Black Olives")); 
        customBurger1.addChild(new Leaf("Spicy Pickles")); 
        customBurger1.addChild(new Leaf("Marinated Tomatoes"));
        customBurger1.addChild(new Leaf("Ciabatta(Vegan)"));
        customBurger1.addChild(new Leaf("Shoestring Fries"));
        order.addChild( customBurger1 );
        Composite customBurger2 = new Composite( "Build Your Own Burger" ) ;
        customBurger2.addChild(new Leaf("Hormone & Antibiotic Free Beef*" )); 
        customBurger2.addChild(new Leaf("1/3lb." ));
        customBurger2.addChild(new Leaf("On A Bun"));
        customBurger2.addChild(new Leaf("Smoked Gouda")); 
        customBurger2.addChild(new Leaf("Greek Feta")); 
        customBurger2.addChild(new Leaf("Fresh Mozzarella" )); 
        customBurger2.addChild(new Leaf("Habanero Salsa")); 
        customBurger2.addChild(new Leaf("Crushed Peanuts")); 
        customBurger2.addChild(new Leaf("Sunny Side Up Egg*")); 
        customBurger2.addChild(new Leaf("Marinated Tomatoes")); 
        customBurger2.addChild(new Leaf("Gluten-Free Bun")); 
        customBurger2.addChild(new Leaf("Shoestring Fries"));
        order.addChild( customBurger2);
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/