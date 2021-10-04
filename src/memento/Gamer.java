package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private final Random random = new Random();
    private static final String[] fruitsName = {"사과", "포도", "바나나", "귤"};

    public Gamer(int money) {
        this.money = money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("돈이 증가했습니다.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("돈이 반으로 줄었습니다.");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("과일(" + f + ")를 받았습니다.");
            fruits.add(f);
        } else {
            System.out.println("아무일도 일어나지 않았습니다.");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(this.money);

        for (String fruit : fruits) {
            if (fruit.startsWith("good~ ")) {
                memento.addFruit(fruit);
            }
        }

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    public int getMoney() {
        return money;
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "good~ ";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
