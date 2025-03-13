package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    protected static final List<String> transportTypes = List.of("Car", "Bike", "Truck");
    private static final List<String> models = List.of("Reno", "Bmw", "Audi", "Mercedes", "Suzuki", "Toyota", "Ford");
    private static final List<String> fuelTypes = List.of("Дизель", "Бензин");

    private static final List<String> numberAbc = List.of("А", "В", "Е", "І", "К", "М", "Н", "О", "Р", "С", "Т", "Х");

    private static final Random random = new Random();

    private TransportFactory() {}


    public static Transport next() {

        String type = transportTypes.get(random.nextInt(3));

        switch (type) {
            case "Car" : return new Car(models.get(random.nextInt(7)), byNumberGenerator(), random.nextInt(200), fuelTypes.get(random.nextInt(2)));
            case "Bike" : return new Bike(models.get(random.nextInt(7)), byNumberGenerator(), random.nextInt(60), random.nextBoolean());
            case "Truck" : return new Truck(models.get(random.nextInt(7)), byTrackNumberGenerator(), random.nextInt(140), random.nextDouble(100));
            default:
                return null;
        }

    }


    private static String byNumberGenerator() {
         String c1 = numberAbc.get(random.nextInt(numberAbc.size()));
         String c2 = numberAbc.get(random.nextInt(numberAbc.size()));

         String intNumber = "";

        for (int i = 0; i < 4; i++) {
            Integer num = random.nextInt(0,9);
            intNumber += num.toString();
        }

         return intNumber + c1 + c2 + "-" + random.nextInt(1,10);
    }

    private static String byTrackNumberGenerator() {
        String c1 = numberAbc.get(random.nextInt(numberAbc.size()));
        String c2 = numberAbc.get(random.nextInt(numberAbc.size()));

        String intNumber = "";

        for (int i = 0; i < 4; i++) {
            Integer num = random.nextInt(0,9);
            intNumber += num.toString();
        }

        return c1 + c2 + intNumber + "-" + random.nextInt(1,10);
    }

}
