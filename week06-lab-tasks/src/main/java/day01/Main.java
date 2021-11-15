package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer posCont = new PositiveNumberContainer();

        while (posCont.add(scanner.nextDouble())) {}

        System.out.println(posCont.getNums());
    }
}
