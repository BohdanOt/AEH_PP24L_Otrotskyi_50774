package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pierwszy program
        System.out.println("Enter lower and upper integer limits: ");
        int first_number;
        int second_number;
        while (true) {
            first_number = scanner.nextInt();
            second_number = scanner.nextInt();
            if (second_number <= first_number) {
                System.out.println("Done");
                break;
            }
            System.out.println("The sums of the squares from " + (first_number * first_number) + " to " + (second_number * second_number) + " is " + ((first_number * first_number) + (second_number * second_number)));
            System.out.println("Enter next set of limit");

        }
        //Drugi program
        double liczba_pierwsza;
        double liczba_druga;

        System.out.println("Podaj pierwszą licbę");
        while (!scanner.hasNextDouble()) {
            System.out.println("To nie jest liczba! Spróbuj ponownie.");
            System.out.print("Podaj pierwszą liczbę: ");
            scanner.next();
        }
        liczba_pierwsza = scanner.nextDouble();
        System.out.println("Operacja matematyczna");
        char option = scanner.next().charAt(0);
        System.out.println("Podaj drugą liczbę:");
        while (!scanner.hasNextDouble()) {
            System.out.println("To nie jest liczba! Spróbuj ponownie.");
            System.out.print("Podaj drugą liczbę: ");
            scanner.next();
        }
        liczba_druga = scanner.nextDouble();
        double result;
        switch (option) {
            case '+':
                result = liczba_pierwsza + liczba_druga;
                System.out.println("Wynnik " + result);
                break;
            case '-':
                result = liczba_pierwsza - liczba_druga;
                System.out.println("Wynnik " + result);
                break;
            case '*':
                result = liczba_pierwsza * liczba_druga;
                System.out.println("Wynnik " + result);
                break;
            case '/':
                if (liczba_druga != 0) {
                    result = liczba_pierwsza / liczba_druga;
                    System.out.println("Wynnik " + result);
                    break;
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }


            default:
                System.out.println("Wybierz opercję matematyczną");
                break;
        }
        ;


    }
}
