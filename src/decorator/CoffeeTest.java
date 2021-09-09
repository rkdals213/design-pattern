package decorator;

import decorator.coffee.Coffee;
import decorator.coffee.EthiopiaAmericano;
import decorator.coffee.KenyaAmericano;
import decorator.decorator.Latte;
import decorator.decorator.Mocha;
import decorator.decorator.WhippedCream;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Mocha kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMocha.brewing();
        System.out.println();

        WhippedCream etiopiaWhippedMocha =
                new WhippedCream(new Mocha(new Latte(new EthiopiaAmericano())));
        etiopiaWhippedMocha.brewing();
        System.out.println();
    }

}
