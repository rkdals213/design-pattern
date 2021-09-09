package decorator.decorator;

import decorator.coffee.Coffee;

public class WhippedCream extends Decorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream ");
    }
}
