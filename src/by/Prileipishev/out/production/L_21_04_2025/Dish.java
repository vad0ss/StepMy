package by.Prileipishev.out.production.L_21_04_2025;

import java.util.Objects;

public class Dish {

    private final String name;
    private final boolean vegetable;
    private final int cal;
    private final Type type;


    public Dish(String name, boolean vegetable, int cal, Type type) {
        this.name = name;
        this.vegetable = vegetable;
        this.cal = cal;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    public int getCal() {
        return cal;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return cal == dish.cal && Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cal);
    }
}
