package by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors;

import by.Prileipishev.out.production.L_27_01_2025.Military_HT.Recruit;

public interface Doctor {
    public default boolean test(Recruit r) {
        return true;
    }
}
