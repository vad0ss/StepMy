package by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors;


import by.Prileipishev.out.production.L_27_01_2025.Military_HT.Recruit;

public class Dentist implements Doctor {

    public boolean test(Recruit recruit) {
        return recruit.getImplantCount() <= 1;
    }
}
