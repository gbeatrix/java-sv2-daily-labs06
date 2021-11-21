package day02.numbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void testIsPerfectNumber() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        int i = 1;
        List<Integer> perfects = new ArrayList<>();
        do {
            if (perfectNumbers.isPerfectNumber(i)) {
                perfects.add(i);
            }
        } while (++i < 10000);
        assertEquals(Arrays.asList(6, 28, 496, 8128), perfects);
    }
}