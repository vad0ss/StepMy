package by.Prileipishev.out.production.L_13_02_2025.HT;

import java.util.Random;

public class OwnerFactory {

    private static String[] names = new String[5];
    private static String[] surNames = new String[5];
    private static Random random = new Random();

    static {
        names[0] = "Анна";
        names[1] = "Пётр";
        names[2] = "Ольга";
        names[3] = "Андрей";
        names[4] = "Павел";

        surNames[0] = "Свириденко";
        surNames[1] = "Моисеенко";
        surNames[2] = "Горбенко";
        surNames[3] = "Петренко";
        surNames[4] = "Маленко";
    }


    public static Owner next() {
        String name = names[random.nextInt(5)];
        String surname = surNames[random.nextInt(5)];
        return new Owner(name, surname);
    }

}
