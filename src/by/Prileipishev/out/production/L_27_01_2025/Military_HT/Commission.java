package by.Prileipishev.out.production.L_27_01_2025.Military_HT;


import by.Prileipishev.out.production.L_27_01_2025.Military_HT.Doctors.*;

public class Commission {

    Doctor[] doctors = new Doctor[5];

    Commission() {
        this.doctors[0] = new Dentist();
        this.doctors[1] = new Oculist();
        this.doctors[2] = new Surgeon();
        this.doctors[3] = new Psychiatrist();
        this.doctors[4] = new Therapist();
    }

    public boolean test(Recruit recruit) {
        Doctor[] doctors = this.doctors;
        boolean result = true;

        for (Doctor doctor : doctors) {
            if (doctor.test(recruit) == false) {
                result = false;
                break;
            }
        }
        return result;
    }
}
