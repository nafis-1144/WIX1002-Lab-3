/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ekram
 */
import java.util.Scanner;

public class q5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        System.out.print("Enter d: ");
        double d = input.nextDouble();

        System.out.print("Enter e: ");
        double e = input.nextDouble();

        System.out.print("Enter f: ");
        double f = input.nextDouble();

        double denominator = (a * d) - (b * c);

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }

        input.close();
    }
}
