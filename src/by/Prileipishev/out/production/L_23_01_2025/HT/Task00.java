package by.Prileipishev.out.production.L_23_01_2025.HT;

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

        String[] materials = {"кирпич", "дерево", "бетон", "камень"};
        String[] streets = {"Ленина", "Строителей", "Московкий проспект", "Чкалова", "Маргелова", "Богатырёва", "Герцена", "Лазо", "Черняховского", "Победителей"};

        Building[] buildings = createBuildings(200, materials, streets);
        //Building.changeMaterial(buildings, "дерево");
        System.out.println("Самое высокое здание : " + Building.getHighestBuild(buildings).getDescription());
        System.out.println("Самое старое здание : " + Building.getOldestBuild(buildings).getDescription());
        System.out.println("Самое новое здание из бетона и высотой больше 40 метров : " + Building.getNewBuildWithParam(buildings, "бетон", 40).getDescription());
    }

    public static Building[] createBuildings(int size, String[] materials, String[] streets) {
        Building[] buildings = new Building[size];
        Random random = new Random();

        for (int i = 0; i < buildings.length; i++) {
            int doors = random.nextInt(20);
            int windows = random.nextInt(30);
            int height = random.nextInt(1, 51);
            int yearsBuild = random.nextInt(1900, 2024);
            String material = materials[random.nextInt(materials.length)];
            String street = streets[random.nextInt(streets.length)];

            buildings[i] = new Building(windows, doors, height, yearsBuild, material, street);
        }

        for (Building building : buildings) {
            System.out.println(building.getDescription());
        }
        return buildings;
    }

}
