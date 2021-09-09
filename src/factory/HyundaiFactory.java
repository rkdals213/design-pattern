package factory;

import java.util.HashMap;
import java.util.Objects;

public class HyundaiFactory extends CarFactory {

    HashMap<String, Car> carMap = new HashMap<>();

    @Override
    public Car createCar(String name) {
        Car car = null;

        if (Objects.equals(name, "sonata")) {
            car = new Sonata();
        } else if (Objects.equals(name, "santafe")) {
            car = new Santafe();
        }

        return car;
    }

    @Override
    public Car returnMyCar(String name) {
        // Jame는 Sonata, Tomas는 Santafe 인 경우
        Car myCar = carMap.get(name);

        if (myCar == null) {
            if (name.equals("James")) {
                myCar = new Sonata();
            } else if (name.equals("Tomas")) {
                myCar = new Santafe();
            }
            carMap.put(name, myCar);
        }

        return myCar;
    }
}
