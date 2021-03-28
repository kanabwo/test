package pl.gda.wsb.devices;

public class Phone {
    public Phone(String type, String model, int imeiNumber) {
        this.type = type;
        this.model = model;
        this.imeiNumber = imeiNumber;
    }

    String type;
    String model;
    int imeiNumber;

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", imeiNumber=" + imeiNumber +
                '}';
    }
}
