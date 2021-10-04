package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money;

    private List<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<String>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List<String> getFruits() {
        return fruits;
    }

    public int getMoney() {                 // 돈을 얻는다.(narrow interface)
        return money;
    }
}
