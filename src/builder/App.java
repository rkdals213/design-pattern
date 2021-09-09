package builder;

public class App {
    public static void main(String[] args) {

        Pizza nyPizza = new NewYorkPizza.Builder(NewYorkPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Pizza calzone = new CalzonePizza.Builder().addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.PEPPER)
                .sauceInside()
                .build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
