package by.Prileipishev.out.production.L_10_02_2025.animal.Animal;

public class Dog extends Animal {

    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public String makeSound() {
        return "Гав-гав!";
    }

    @Override
    public String move() {
       return this.name + " бегает на четырех лапах";
    }

    @Override
    public String eat() {
      return this.name + " ест собачий корм";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
