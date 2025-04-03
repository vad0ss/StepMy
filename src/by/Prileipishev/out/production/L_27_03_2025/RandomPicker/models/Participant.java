package by.Prileipishev.out.production.L_27_03_2025.RandomPicker.models;

import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.enums.Sex;
import java.util.Objects;

public class Participant {

    String name;
    Integer age;
    Integer passportId;
    Sex sex;

    public Participant(String name, Integer age, Integer passportId, Sex sex) {
        this.name = name;
        this.age = age;
        this.passportId = passportId;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPasportId() {
        return passportId;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(passportId, that.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportId);
    }

    @Override
    public String toString() {
        return "Участник : " +
                "Имя = '" + name + '\'' +
                ", Возраст = " + age +
                ", паспорт Id = " + passportId +
                ", пол = " + sex.getGender();
    }
}
