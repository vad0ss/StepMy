package by.Prileipishev.out.production.L_21_04_2025.grocery;

import by.Prileipishev.out.production.L_21_04_2025.Dish;
import by.Prileipishev.out.production.L_21_04_2025.Type;
import by.Prileipishev.out.production.L_21_04_2025.grocery.factory.GroceryItemFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println(dairy);
        System.out.println(perishable);
        System.out.println(priceSorted);

    }


}
