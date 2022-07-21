package web.model;

public class Car {

    private int id;
    private String model;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int power;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Car(int id, String model, String color, int power) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.power = power;
    }
}
