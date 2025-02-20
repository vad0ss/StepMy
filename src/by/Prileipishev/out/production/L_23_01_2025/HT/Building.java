package by.Prileipishev.out.production.L_23_01_2025.HT;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Building {

    int windowQuantity;
    int doorQuantity;

    int height;
    int yearBuild;
    String material;
    String street;

    public Building(int windowQuantity, int doorQuantity, String material, String street) {
        this.windowQuantity = windowQuantity;
        this.doorQuantity = doorQuantity;
        this.material = material;
        this.street = street;
    }

    public Building(int windowQuantity, int doorQuantity, int height, int yearBuild, String material, String street) {
        this.windowQuantity = windowQuantity;
        this.doorQuantity = doorQuantity;
        this.height = height;
        this.yearBuild = yearBuild;
        this.material = material;
        this.street = street;
    }


    public String getDescription() {
        return "Здание на улице " + this.street + " : " + this.windowQuantity + " окна " + this.doorQuantity + " дверей, из " + this.material + " высотой " + this.height + ", " + this.yearBuild + " года посторойки";
    }

    public static Building getHighestBuild(Building[] buildings) {
        Building hBuild = buildings[0];

        for (Building build : buildings) {
            hBuild = build.height > hBuild.height ? build : hBuild;
        }
        return hBuild;
    }

    public static Building getOldestBuild(Building[] buildings) {
        Building oBuild = buildings[0];

        for (Building build : buildings) {
            oBuild = build.yearBuild < oBuild.yearBuild ? build : oBuild;
        }
        return oBuild;
    }

    public static void changeMaterial(Building[] buildings, String material) {

        for (Building building : buildings) {
            if (building.windowQuantity == 10) {
                building.material = material;
            }
        }

        for (Building building : buildings) {
            if (Objects.equals(building.material, material)) {
                System.out.println(building.getDescription());
            }
        }
    }
    public static Building getNewestBuild(List<Building> buildings) {
        Building nBuild = buildings.get(0);

        for (Building build : buildings) {
            nBuild = build.yearBuild > nBuild.yearBuild ? build : nBuild;
        }

        return nBuild;
    }

    public static Building getNewBuildWithParam(Building[] buildings, String material, int height) {
        List<Building> pBuildings = new ArrayList<>();

        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].height > height && buildings[i].material.equals(material)) {
                pBuildings.add(buildings[i]);
            }
        }
        return getNewestBuild(pBuildings);
    }

}
