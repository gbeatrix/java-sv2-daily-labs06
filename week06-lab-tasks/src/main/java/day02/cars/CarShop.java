package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car car : carsForSell) {
            sum += car.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int num = 0;
        for (Car car : carsForSell) {
            if (car.getPrice() <= price) {
                num++;
            }
        }
        return num;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : carsForSell) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }
}
