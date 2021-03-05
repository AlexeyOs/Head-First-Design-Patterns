package headfirst.designpatterns.factory.pizzafm;

public class CaliforniaStyleClamPizza extends Pizza {

    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Tomato");
        toppings.add("Champignon");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }
}
