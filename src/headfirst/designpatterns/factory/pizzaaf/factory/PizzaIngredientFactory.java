package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.entity.Veggies;
import headfirst.designpatterns.factory.pizzaaf.entity.*;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
