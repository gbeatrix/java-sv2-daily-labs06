package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void init() {
        car = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    }

    @Test
    void testCreateCar() {
        assertEquals("Toyota", car.getBrand());
        assertEquals(1.2, car.getEngine(), 1e-6);
        assertEquals(Color.BLACK, car.getColor());
        assertEquals(2300000, car.getPrice());
    }

    @Test
    void testDecreasePrice() {
        car.decreasePrice(10);
        assertEquals(2070000, car.getPrice());
    }
}