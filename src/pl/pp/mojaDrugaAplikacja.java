package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 10;
        double y = 2;
        var result = x + y;
        System.out.println("x + y = " + result);
        result = x - y;
        System.out.println("x -y = " + result);
        result = x * y;
        System.out.println("x * y = " + result);
        result = x / y;
        System.out.println("x / y = " + result);
        result = x % y;
        System.out.println("x % y = " + result);
        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("x + y = " + (first + second));
        System.out.println();

        System.out.println("Input x:");
        double X1 = scanner.nextDouble();
        System.out.println("x = " + X1);
        var result1 = 2 * X1;
        System.out.println("2x = " + result1);
        result1 = X1 * X1;
        System.out.println("x^2 = " + result1);
        System.out.println();

        System.out.println("Input age:");
        double age = scanner.nextDouble();
        System.out.println("Age in seconds: " + age * 60 * 60 * 24 * 365);


    }
}
