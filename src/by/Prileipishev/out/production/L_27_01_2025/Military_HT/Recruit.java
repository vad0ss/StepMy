package by.Prileipishev.out.production.L_27_01_2025.Military_HT;

public class Recruit {

    int id;
    int implantCount;
    int cardiogram;
    double visionCoeff;
    String firstName;
    String middleName;
    String lastName;
    String diagnosis;

    boolean valid = true;
    boolean flatFeet;

    @Override
    public String toString() {
        String valid = this.lastName + " " + this.firstName + " " + this.middleName +  " годен";
        String notValid = this.lastName + " " + this.firstName + " " + this.middleName +  " не годен";

        return this.valid ? valid : notValid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public void setImplantCount(int implantCount) {
        this.implantCount = implantCount;
    }

    public int getCardiogram() {
        return cardiogram;
    }

    public void setCardiogram(int cardiogram) {
        this.cardiogram = cardiogram;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public void setVisionCoeff(double visionCoeff) {
        this.visionCoeff = visionCoeff;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public void setFlatFeet(boolean flatFeet) {
        this.flatFeet = flatFeet;
    }
}
