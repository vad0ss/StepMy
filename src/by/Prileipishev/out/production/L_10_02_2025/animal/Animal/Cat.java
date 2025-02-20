package by.Prileipishev.out.production.L_10_02_2025.animal.Animal;

public class Cat extends Pet {

    public Cat(String name, String species, int age, String ownerName) {
        super(name, species, age, ownerName);
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
        return "Кот по имени " + this.name + ", возраст: " + this.age + " (" + "Домашнее животное, хозяин: " + this.ownerName + ")";
    }

    @Override
    public String play() {
        return this.name + " играет с хозяином " + this.ownerName;
    }
}
