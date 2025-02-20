package by.Prileipishev.out.production.L_13_02_2025.HT;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OwnerFactory ownerFactory = new OwnerFactory();
        PetFactory petFactory = new PetFactory();

        ArrayList<Owner> owners = new ArrayList<Owner>();

        for (int i = 0; i < 100; i++) {
            owners.add(ownerFactory.next());
        }

        for (Owner owner : owners) {
            for (int i = 0; i < 200; i++) {
                owner.addPet(petFactory.next());
            }
            System.out.println(owner);
        }

        System.out.println("Общее количество владельцев : " + Owner.getTotalOwners());
    }
}
