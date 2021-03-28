package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {

    public Car(String model, Producer producer, int power, int mass, String color) {
        this.model = model;
        this.producer = producer;
        this.power = power;
        this.mass = mass;
        this.color = color;
    }

    final String model;
    public final Producer producer;
    int power;
    int mass;
    String color;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", power=" + power +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                '}';
    }
}
