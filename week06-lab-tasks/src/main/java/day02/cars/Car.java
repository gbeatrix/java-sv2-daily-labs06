package day02.cars;

public class Car {
    private String brand;
    private double engine;
    private Color color;
    private int price;

    public Car(String brand, double engine, Color color, int price) {
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent) {
        price = (int) (price * (100d - percent) / 100);
    }

    public String getBrand() {
        return brand;
    }

    public double getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
