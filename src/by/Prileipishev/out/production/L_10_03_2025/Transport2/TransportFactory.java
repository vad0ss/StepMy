package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static List<String> transportTypes = List.of("Car", "Bike", "Truck");
    private static final List<String> models = List.of("Reno", "Bmw", "Audi", "Mercedes", "Suzuki", "Toyota", "Ford");
    private static final List<String> fuelTypes = List.of("Дизель", "Бензин");

    private static final List<Character> numberAbc = List.of('А', 'В', 'Е', 'І', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'Х');

    public static List<String> getTransportTypes() {
        return transportTypes;
    }

    private static final Random random = new Random();

    private TransportFactory() {}


    public static Transport next() {

        String type = transportTypes.get(random.nextInt(3));

        switch (type) {
            case "Car" : return new Car(models.get(random.nextInt(7)), byNumberGenerator(), random.nextInt(200), fuelTypes.get(random.nextInt(2)));
            case "Bike" : return new Bike(models.get(random.nextInt(7)), byNumberGenerator(), random.nextInt(60), random.nextBoolean());
            case "Truck" : return new Truck(models.get(random.nextInt(7)), byNumberGenerator(), random.nextInt(140), random.nextDouble(100));
        }

        return null;
    }


    private static String byNumberGenerator() {
         char c1 = numberAbc.get(random.nextInt(12));
         char c2 = numberAbc.get(random.nextInt(12));

         Integer intNumber = random.nextInt(1000, 9999);

         return intNumber.toString() + c1 + c2 + "-" + random.nextInt(1,10);
    }

}
