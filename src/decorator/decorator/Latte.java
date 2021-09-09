package decorator.decorator;

import decorator.coffee.Coffee;

public class Latte extends Decorator {

    public Latte(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding Milk ");
    }
}
