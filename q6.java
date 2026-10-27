/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ekram
 */
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the circle's radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter the point's x-coordinate: ");
        double x = input.nextDouble();

        System.out.print("Enter the point's y-coordinate: ");
        double y = input.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
        } else {
            double distanceSquared = (x * x) + (y * y);
            double radiusSquared = radius * radius;

            if (distanceSquared < radiusSquared) {
                System.out.println("The point is inside the circle.");
            } else if (distanceSquared > radiusSquared) {
                System.out.println("The point is outside the circle.");
            } else {
                System.out.println("The point is on the circle.");
            }
        }

        input.close();
    }
}
