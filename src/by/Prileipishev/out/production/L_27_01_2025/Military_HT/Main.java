package by.Prileipishev.out.production.L_27_01_2025.Military_HT;


public class Main {

    public static void main(String[] args) {
        Commission commission = new Commission();
        ArrayRecruits recruits = new ArrayRecruits(1000);
        RecruitGenerator recruitGenerator = new RecruitGenerator();

        for (int i = 0; i < 1000; i++) {
            Recruit recruit = recruitGenerator.generate();
            recruit.setValid(commission.test(recruit));
            recruits.add(recruit);
        }

        recruits.sortByLastName();

        System.out.println("Список годных к службе:");

        for (Recruit recruit : recruits.recruits) {
            if(recruit.isValid()) {
                System.out.println(recruit);
            }
        }

        System.out.println();
        System.out.println("Список не годных к службе:");

        for (Recruit recruit : recruits.recruits) {
            if(!recruit.isValid()) {
                System.out.println(recruit);
            }
        }
    }

}
