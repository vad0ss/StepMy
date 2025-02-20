package by.Prileipishev.out.production.L_30_01_2025;

//import WheelArray;

public class Task00 {

    public static void main(String[] args) {

//        Wheel[] wheelArray = new Wheel[4];
//
//        for (int i = 0; i < wheelArray.length; i++) {
//            wheelArray[i] = new Wheel("Зимняя", 20, "Резина");
//        }
//
//        Car audi = new Car("Audi", "TT",
//                1999, wheelArray);
//
//        System.out.println(audi);
//        System.out.println(wheelArray);

        WheelArray wheelArray = new WheelArray(4);
        wheelArray.add(new Wheel("Зимняя", 20, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 20, "Резина"));
//        wheelArray.add(new Wheel("Зимняя", 20, "Резина"));
//        wheelArray.add(new Wheel("Зимняя", 20, "Резина"));

        System.out.println(wheelArray);

//        wheelArray.add(new Wheel("Зимняя", 20, "Резина"));
//        wheelArray.add(new Wheel("Летняя", 18, "Резина"));

        System.out.println(wheelArray);
        //Wheel wheel = wheelArray.get(wheelArray.size);

        Wheel wheel = wheelArray.get(wheelArray.size);

        System.out.println(wheel);

        wheelArray.sortByDiameter();

        System.out.println(wheelArray);

        wheelArray.sortByType();

        System.out.println(wheelArray);

        System.out.println(wheelArray.getSize());
        

    }

}
