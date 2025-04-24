package by.Prileipishev.out.production.L_21_04_2025.grocery;

import by.Prileipishev.out.production.L_21_04_2025.Dish;
import by.Prileipishev.out.production.L_21_04_2025.grocery.factory.GroceryItemFactory;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        GroceryItemFactory factory = new GroceryItemFactory();
        List<GroceryItem> groceryItems = new ArrayList<>();

        List<Customer> customers = List.of(
                new Customer("Андрей", List.of(
                        new GroceryItem("Milk", Category.DAIRY, 1.2, true),
                        new GroceryItem("Bread", Category.BAKERY, 0.8, true)
                )),
                new Customer("Ирина", List.of(
                        new GroceryItem("Apple", Category.FRUIT, 0.5, true),
                        new GroceryItem("Wine", Category.BEVERAGE, 5.0, false),
                        new GroceryItem("Cheese", Category.DAIRY, 3.0, true)
                )),
                new Customer("Сергей", List.of(
                        new GroceryItem("Eggs", Category.DAIRY, 2.0, true),
                        new GroceryItem("Chocolate", Category.BAKERY, 1.5, false)
                )),
                new Customer("Сергей", new ArrayList<>())
        );

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

        // Customers task

        System.out.println();
        System.out.println("Customers");
        System.out.println();

        List<GroceryItem> groceryItemList = customers.stream()
                .flatMap(c -> c.getShoppingList().stream()).collect(Collectors.toList());

        System.out.println(groceryItemList);

        long count = customers.stream()
                .map(Customer::getName)
                .count();

        System.out.println(count);

        Optional<Customer> maxCustomer = customers.stream()
                .max(Comparator.comparingDouble(c -> c.getShoppingList().stream().mapToDouble(g -> g.getPrice()).sum()));

        maxCustomer.ifPresent(System.out::println);

        Set<String> uniqueGrocery = customers.stream()
                .flatMap(c -> c.getShoppingList().stream())
                .map(GroceryItem::getName)
                .collect(Collectors.toSet());

        System.out.println(uniqueGrocery);

        Map<Category, Set<String>> categoryTable;

        Optional<Customer> emptyCustomer = customers.stream()
                .filter(c -> c.getShoppingList().isEmpty())
                .findFirst();

        emptyCustomer.ifPresent(System.out::println);


    }

}
