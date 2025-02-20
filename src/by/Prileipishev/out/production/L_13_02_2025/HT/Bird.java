package by.Prileipishev.out.production.L_13_02_2025.HT;

public class Bird extends Animal {

    public Bird(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public String move() {
        return this.name + " летает в небе";
    }

    @Override
    public String eat() {
        return this.name + " клюет зерна";
    }

    @Override
    public String makeSound() {
        return this.name + " чирикает: Чик-Чирик!";
    }

    @Override
    public String toString() {
        return "Птица по имени " + this.name + ", возраст: " + this.age;
    }
}
