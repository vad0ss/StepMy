package by.Prileipishev.out.production.L_14_04_2025;

public class Fruit<T> {

    private int weight;
    private Color color;

    public Fruit(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

}
