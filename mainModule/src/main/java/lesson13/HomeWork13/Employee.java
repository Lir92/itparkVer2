package lesson13.HomeWork13;

public class Employee implements Comparable<Employee> {

    Integer IDNumber;
    String fullName;
    int experience;

    public Employee(){
    }

    public Employee(int IDNumber, String fullName, int experience) {
        this.IDNumber = IDNumber;
        this.fullName = fullName;
        this.experience = experience;
    }

    public Integer getIDNumber() {
        return IDNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getIDNumber().compareTo(o.getIDNumber());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "IDNumber=" + IDNumber +
                ", fullName='" + fullName + '\'' +
                ", seniority=" + experience +
                '}';
    }
}
