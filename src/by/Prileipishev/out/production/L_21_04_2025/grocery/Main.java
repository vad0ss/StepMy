package by.Prileipishev.out.production.L_21_04_2025.grocery;

import by.Prileipishev.out.production.L_21_04_2025.grocery.factory.GroceryItemFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        GroceryItemFactory factory = new GroceryItemFactory();
        List<GroceryItem> groceryItems = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            groceryItems.add(factory.next());
        }

        for (GroceryItem item : groceryItems) {
            System.out.println(item);
        }

        List<GroceryItem> dairy = groceryItems.stream()
                .filter(item -> item.getCategory() == Category.DAIRY)
                .toList();


        List<GroceryItem> perishable = groceryItems.stream()
                .filter(GroceryItem::isPerishable)
                .toList();

        List<GroceryItem> priceSorted = groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .toList();

        List<GroceryItem> decrasePriceSorted = groceryItems.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .limit(3)
                .toList();

        List<String> topThreeNames = decrasePriceSorted.stream()
                .map(GroceryItem::getName)
                .toList();


        System.out.println(dairy);
        System.out.println(perishable);
        System.out.println(priceSorted);
        System.out.println(decrasePriceSorted);
        System.out.println(topThreeNames);

        groceryItems.forEach(item -> System.out.println(item.getName() + ": price * " + item.getPrice() + " Br"));

        boolean cheap = groceryItems.stream().anyMatch(item -> item.getPrice() < 1);
        boolean noZero = groceryItems.stream().allMatch(item -> item.getPrice() <= 0);

        if (cheap) {
            System.out.println("Товар дешевле 1 рубля есть");
        } else {
            System.out.println("Товара дешевле 1 рубля нет");
        }

        if (noZero) {
            System.out.println("Товар равных или меньше 0 нет");
        } else {
            System.out.println("Товары дешевле или равные 0 есть");
        }

        Optional<GroceryItem> opFirstVeg = groceryItems.stream().filter(item -> item.getCategory() == Category.VEGETABLE).findFirst();

        opFirstVeg.ifPresent(item -> System.out.println(item.getName()));

        List<Category> uniqueCategories = groceryItems.stream()
                .map(GroceryItem::getCategory)
                .distinct()
                .toList();

        System.out.println(uniqueCategories);
    }

}
