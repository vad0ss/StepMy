package by.Prileipishev.out.production.L_13_02_2025.HT;

public class Cat extends Pet {

    public Cat(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public String move() {
        return this.name + " крадется по дому.";
    }

    @Override
    public String eat() {
        return this.name + " ест рыбу";
    }

    @Override
    public String makeSound() {
        return this.name + " говорит: Мяу!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String play() {
        return this.name + " играет с хозяином " + super.getOwnerName();
    }
}
