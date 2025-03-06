package by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors;

import by.Prileipishev.out.production.L_27_01_2025.Military_HT.Recruit;

public class Therapist implements Doctor {

    public boolean test(Recruit recruit) {
        return recruit.getCardiogram() >= 60 && recruit.getCardiogram() <= 100;
    }

}
