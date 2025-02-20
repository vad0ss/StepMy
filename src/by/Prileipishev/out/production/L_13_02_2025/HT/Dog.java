package by.Prileipishev.out.production.L_13_02_2025.HT;

public class Dog extends Pet {

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
    public String play() {
        return this.name + " играет с хозяином " + super.getOwnerName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
