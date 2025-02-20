package by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors;

import L_27_01_2025.Military_HT.Recruit;

public class Surgeon implements Doctor {

    public boolean test(Recruit recruit) {
        return recruit.isFlatFeet();
    }

}
