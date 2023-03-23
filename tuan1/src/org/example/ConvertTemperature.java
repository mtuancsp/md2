package org.example;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9) * (fahrenheit - 32);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;
        int choice;

        do{
            System.out.println("\nMenu.");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:{
                    System.out.print("Enter F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.printf("F to C: %.2f\n", fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.print("Enter C: ");
                    celsius = scanner.nextDouble();
                    System.out.printf("C to F: %.2f\n", celsiusToFahrenheit(celsius));
                    break;
                }
            }
        } while (choice != 0);
    }
}
