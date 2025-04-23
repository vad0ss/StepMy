package by.Prileipishev.out.production.L_21_04_2025.grocery.factory;

import by.Prileipishev.out.production.L_21_04_2025.grocery.Category;
import by.Prileipishev.out.production.L_21_04_2025.grocery.GroceryItem;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class GroceryItemFactory {

    private static final Random random = new Random();


    private final List<String> categoryNames = List.of("DAIRY", "VEGETABLE", "FRUIT", "BAKERY", "MEAT", "BEVERAGE");
    private final Map<Category, List<String>> map = Map.of(
            Category.DAIRY, List.of("молоко", "сметана"),
            Category.VEGETABLE, List.of("салат", "сельдерей"),
            Category.FRUIT, List.of("апельсин", "банан"),
            Category.BAKERY, List.of("пирожок", "булочка"),
            Category.MEAT, List.of("говядина", "свинина"),
            Category.BEVERAGE, List.of("чай", "кофе")
    );

    public GroceryItem next() {
        Category category = Category.valueOf(categoryNames.get(random.nextInt(0, 6)));
        List<String> names = map.get(category);
        String name = names.get(random.nextInt(0,2));

        return new GroceryItem(name, category, random.nextDouble(0,20), random.nextBoolean());
    }


}
