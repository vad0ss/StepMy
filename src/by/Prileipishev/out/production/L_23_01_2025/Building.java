package by.Prileipishev.out.production.L_23_01_2025;

public class Building {

    int windowQuantity;
    int doorQuantity;
    String material;
    String street;

    public Building(int windowQuantity, int doorQuantity, String material, String street) {
        this.windowQuantity = windowQuantity;
        this.doorQuantity = doorQuantity;
        this.material = material;
        this.street = street;
    }


    public String getDescription() {
        return "Здание на улице " + this.street + " : " + this.windowQuantity + " окна " + this.doorQuantity + " дверей, из " + this.material;
    }

}
