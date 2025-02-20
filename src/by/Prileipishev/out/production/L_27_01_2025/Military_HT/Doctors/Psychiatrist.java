package by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors;


import by.Prileipishev.out.production.L_27_01_2025.Military_HT.Recruit;

import java.util.Random;

public class Psychiatrist implements Doctor {

    Random random = new Random();

    public boolean test(Recruit recruit) {
        return this.random.nextInt(101) >= 50;
    }

}
