package headfirst.designpatterns.factory.pizzafm;

public class CaliforniaStylePepperoniPizza  extends Pizza
{
    public CaliforniaStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Tomato");
        toppings.add("Champignon");
        toppings.add("Garlic");
        toppings.add("Sliced Pepperoni");
    }
}
