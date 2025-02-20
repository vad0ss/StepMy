package by.Prileipishev.out.production.L_30_01_2025;

import java.util.Arrays;
import java.util.Objects;

public class WheelArray {

    Wheel[] wheels;
    int size;


    public WheelArray(int capacity) {
        this.wheels = new Wheel[capacity];
    }

    public void add(Wheel wheel) {
        if (size < this.wheels.length) {
            this.wheels[size++] = wheel;
        } else {
            Wheel[] wheels1 = new Wheel[this.wheels.length + 1];

            for (int i = 0; i < wheels.length; i++) {
                wheels1[i] = wheels[i];
            }

            wheels1[size++] = wheel;
            this.wheels = wheels1;
        }
    }

    public Wheel get(int index) {
        return this.wheels[index - 1];
    }

    public void sortByDiameter() {
        for (int i = 0; i < this.wheels.length; i++) {
            for (int j = 0; j < this.wheels.length - i - 1; j++) {

                if (Objects.isNull(wheels[j + 1])) {
                    break;
                }

                if (wheels[j].wheelDiameter > wheels[j + 1].wheelDiameter) {
                    Wheel temp = wheels[j];
                    wheels[j] = wheels[j + 1];
                    wheels[j + 1] = temp;
                }
            }
        }
    }

    public void sortByType() {
        for (int i = 0; i < this.wheels.length; i++) {
            for (int j = 0; j < this.wheels.length - i - 1; j++) {

                if(wheels[j + 1] == null) {
                    break;
                }

                if (wheels[j].wheelType.compareTo(wheels[j + 1].wheelType) > 0) {
                    Wheel temp = wheels[j];
                    wheels[j] = wheels[j + 1];
                    wheels[j + 1] = temp;
                }
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "WheelArray{" +
                "wheels=" + Arrays.toString(wheels) +
                ", size=" + size +
                '}';
    }

}
