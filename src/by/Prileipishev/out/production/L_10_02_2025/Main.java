package by.Prileipishev.out.production.L_10_02_2025;

import L_10_02_2025.animal.Animal.*;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];

        animals[0] = new Cat("Мурка", "Кошка", 2, "Анна");
        animals[1] = new Lion("Симба", "лев", 2, "саванне");

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.makeSound());
            System.out.println(animal.move());
            System.out.println(animal.sleeping());
            System.out.println(animal.eat());

            if(animal instanceof Pet pet) {
                System.out.println(pet.play());
            } else if (animal instanceof WildAnimal wild) {
                System.out.println(wild.hunt());
            }

            System.out.println();
        }

    }

}
