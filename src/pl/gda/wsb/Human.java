package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Date;
import java.util.Objects;

public class Human {
    public Human(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    String firstName;
    String lastName;
    String position;
    Animal pet;
    Car car;
    private Double salary;

    public Double getSalary() {
        System.out.println(new Date() + " pobrano info o wypolacie");
        return this.salary;
    }

    public void setSalary(Double salary) {
        if(salary!=0) {
            System.out.println("Dane zaostaly wyslane do systemu ksiegowego");
            System.out.println("nalezy odebrac aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US juz wie o zmianie dochodu");
            this.salary = salary;
        }
        else
            System.out.println("wyplata nie moze byc ujemna");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(position, human.position) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
