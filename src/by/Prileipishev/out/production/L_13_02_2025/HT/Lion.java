package by.Prileipishev.out.production.L_13_02_2025.HT;

public class Lion extends WildAnimal {

    public Lion(String name, String species, int age, String habitat) {
        super(name, species, age, habitat);
    }

    @Override
    public String makeSound() {
        return this.name + " рычит: Ррррр!";
    }

    @Override
    public String move() {
        return this.name  + " быстро бежит по саванне";
    }

    @Override
    public String eat() {
        return this.name + " ест мясо";
    }

    @Override
    public String hunt() {
        return this.name + " охотится в Африканской саванне.";
    }

    @Override
    public String toString() {
        return "Лев по имени " + this.name + ", возраст: " + this.age + " (" + "Дикое животное, среда обитания: " + this.habitat + ")";
    }
}
