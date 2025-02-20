package by.Prileipishev.out.production.L_13_02_2025.Animal;

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
        //return "Кот по имени " + this.name + ", возраст: " + this.age + " (" + "Домашнее животное, хозяин: " + this.ownerName + ")";
        return super.toString();
    }

}
