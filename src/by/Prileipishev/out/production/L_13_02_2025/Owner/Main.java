package by.Prileipishev.out.production.L_13_02_2025.Owner;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        Owner ownerThree = new Owner();

        Pet petOne = new Cat("Мурка", "Кошка", 3);
        Pet petTwo = new Cat("Симба", "Кошка", 3);
        Pet petThree = new Cat("Катька", "Кошка", 3);

        ownerOne.addPet(petOne);
        ownerTwo.addPet(petTwo);
        ownerThree.addPet(petThree);

        System.out.println(ownerOne);
        System.out.println(ownerTwo);
        System.out.println(ownerThree);

        System.out.println("Общее количество владельцев : " + Owner.getTotalOwners());




//        Animal[] animals = new Animal[2];
//
//        animals[0] = new Cat("Мурка", "Кошка", 2, "Анна");
//        animals[1] = new Lion("Симба", "лев", 2, "саванне");
//
//        for (Animal animal : animals) {
//            System.out.println(animal);
//            System.out.println(animal.makeSound());
//            System.out.println(animal.move());
//            System.out.println(animal.sleeping());
//            System.out.println(animal.eat());
//
//            if(animal instanceof Pet pet) {
//                System.out.println(pet.play());
//            } else if (animal instanceof WildAnimal wild) {
//                System.out.println(wild.hunt());
//            }
//
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("Общее количество животных " + Animal.getTotalAnimals());
    }

}
