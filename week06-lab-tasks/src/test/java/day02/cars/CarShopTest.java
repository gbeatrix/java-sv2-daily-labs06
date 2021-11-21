package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    CarShop carShop;

    @BeforeEach
    void init() {
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop = new CarShop("Best Car", 10_000_000);
        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);
    }

    @Test
    void testCreateCarShop() {
        assertEquals("Best Car", carShop.getName());
        assertEquals(10000000, carShop.getMaxPrice());
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void testAddValidCar() {
        assertTrue(carShop.addCar(car1));
        assertEquals(4, carShop.getCarsForSell().size());
        assertSame(car1, carShop.getCarsForSell().get(3));
    }

    @Test
    void testAddInvalidCar() {
        assertFalse(carShop.addCar(car2));
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void testSumCarPrice() {
        car1.decreasePrice(10);
        assertEquals(6270000, carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCharsCheaperThan() {
        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void testCarsWithBrand() {
        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("BMW").size());
    }
}