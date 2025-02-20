package by.Prileipishev.out.production.L_30_01_2025;

public class Wheel {

    String wheelType;
    int wheelDiameter;
    String wheelMaterial;


    public Wheel(String wheelType, int wheelDiameter, String wheelMaterial) {
        this.wheelType = wheelType;
        this.wheelDiameter = wheelDiameter;
        this.wheelMaterial = wheelMaterial;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelType='" + wheelType + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                ", wheelMaterial='" + wheelMaterial + '\'' +
                '}';
    }
}
