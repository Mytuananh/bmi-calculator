package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Height: ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18.5) {
            System.out.printf("%-20.3f%s", bmi, "UnderWeight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.3f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.3f%s", bmi, "OverWeight");
        } else {
            System.out.printf("%-20.3f%s", bmi, "Obese");
        }
    }
}
