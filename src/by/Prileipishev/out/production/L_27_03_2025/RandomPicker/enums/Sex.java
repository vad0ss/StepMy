package by.Prileipishev.out.production.L_27_03_2025.RandomPicker.enums;

public enum Sex {
    MALE("Мужской"),
    FEMALE("Женский");

    private final String gender;

    Sex(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
