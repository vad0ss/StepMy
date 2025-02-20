package by.Prileipishev.out.production.L_23_01_2025;

import java.util.Objects;
import java.util.Random;

public class Task00 {


    public static void main(String[] args) {

        Product milk = new Product();
        Product bread = new Product();
        Product apple = new Product("Apple", 40, 500);
        Building build = new Building(4, 5, "кирпича", "Ленина");

        milk.setName("Milk");
        milk.setPrice(10);
        milk.setQuantity(800);

        bread.setName("Bread");
        bread.setPrice(5);
        bread.setQuantity(700);

        System.out.println("Total Milk price: " + milk.getName() + " := " + milk.getTotalValue());
        System.out.println("Total Bread price: " + bread.getName() + " := " + bread.getTotalValue());
        System.out.println("Total Apple price: " + apple.getName() + " := " + apple.getTotalValue());
        System.out.println(build.getDescription());

        createBuildings(200);
        Building[] buildings = createBuildings(200);
        changeMaterial(buildings);

    }

    public static Building[] createBuildings(int size) {
        Building[] buildings = new Building[size];
        Random random = new Random();

        for (int i = 0; i < buildings.length; i++) {
            int doors = random.nextInt(20);
            int windows = random.nextInt(30);

            buildings[i] = new Building(windows, doors, "кирпича", "Ленина");
        }

        for (Building building : buildings) {
            System.out.println(building.getDescription());
        }

        return buildings;

    }

    public static void changeMaterial(Building[] buildings) {

        for (Building building : buildings) {
            if (building.windowQuantity == 10) {
                building.material = "дерево";
            }
        }

        for (Building building : buildings) {
            if (Objects.equals(building.material, "дерево")) {
                System.out.println(building.getDescription());
            }
        }

    }

}
