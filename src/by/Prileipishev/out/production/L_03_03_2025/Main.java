package by.Prileipishev.out.production.L_03_03_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();


        stringList.add("test");
        stringList.add("test2");

        stringList2.add("test3");
        stringList2.add("test4");

        System.out.println("размер stringList => " + stringList.size());
        stringList2.addAll(stringList2);
        System.out.println("размер stringList => " + stringList.size());

        System.out.println(stringList);

        stringList.clear();

        System.out.println("размер stringList => " + stringList.size());


    }

    public static void test() {
        Car audi = new Car("Audi", 1988);
        Car bmw = new Car("Bmw", 2005);

        //List<Car> cars = List.of(audi, bmw);
        List<Car> cars = new ArrayList<>();

        cars.add(audi);
        cars.add(bmw);

        for (Car car : cars) {
            if (car.getYear() == 2005) {
                System.out.println();
            }
        }

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            Car next = iterator.next();

            if (next.getYear() == 2005) {
               iterator.remove();
            }
        }

    }

}
