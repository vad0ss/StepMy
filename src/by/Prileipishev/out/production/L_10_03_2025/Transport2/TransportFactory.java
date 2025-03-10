package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    // transport
    private static final List<String> transportTypes = List.of("Car", "Bike", "Truck");
    private static final List<String> models = List.of("Reno", "Bmw", "Audi", "Mercedes");
    private static final List<String> fuelTypes = List.of("Дизель", "Бензин");


    private static final Random random = new Random();

    private TransportFactory() {}


    public static Transport next() {

        String type = transportTypes.get(random.nextInt(3));

        switch (type) {
            case "Car" : return new Car(models.get(random.nextInt(4)), random.nextInt(200), fuelTypes.get(random.nextInt(2)));
            case "Bike" : return new Bike(models.get(random.nextInt(4)), random.nextInt(60), random.nextBoolean());
            case "Truck" : return new Truck(models.get(random.nextInt(4)), random.nextInt(140), random.nextDouble(100));
        }

        return null;
    }

}
