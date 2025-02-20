package by.Prileipishev.out.production.L_27_01_2025.Military_HT;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRecruits {

    int size;
    Recruit[] recruits;

    ArrayRecruits(int size) {
        this.size = size;
        this.recruits = new Recruit[size];
    }

    public void add(Recruit recruit) {
        for (int i = 0; i < this.size; i++) {
            if (this.recruits[i] == null) {
                recruit.setId(i);
                this.recruits[i] = recruit;
                break;
            }
        }
    }

    public Recruit get(int index) {
        return this.recruits[index];
    }

    public int getSize() {
        return this.size;
    }

    public void sortByLastName() {
        Arrays.sort(this.recruits, new Comparator<Recruit>() {
            public int compare(Recruit r1, Recruit r2) {
                return r1.getLastName().compareTo(r2.getLastName());
            }
        });
    }

}
