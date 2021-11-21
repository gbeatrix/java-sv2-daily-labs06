package day02.numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number) {
        int sumOfDivs = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivs += i;
            }
        }
        return sumOfDivs == number;
    }
}
