package javaBasic;

public class Car
{
    private int Model;
    private String Name;
    private double price;
     //No-arg constructor
    public Car() {
    }

    public Car(double price) {
        this.price = price;
    }

    // signature Constructor
    public Car(int model, String name, double price) {
        Model = model;
        Name = name;
        this.price = price;
    }

    public Car(int model) {
        this.Model = model;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
