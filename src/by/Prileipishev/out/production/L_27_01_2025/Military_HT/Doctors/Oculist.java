package by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors;

import by.Prileipishev.out.production.L_27_01_2025.Military_HT.Recruit;

public class Oculist implements Doctor {

    public boolean test(Recruit recruit) {
        return recruit.getVisionCoeff() >= 0.8 && recruit.getVisionCoeff() <= 1.2;
    }
}
