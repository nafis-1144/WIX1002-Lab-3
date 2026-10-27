/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ekram
 */
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        String operatorText = input.next();
        char operator = operatorText.charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println("Result: " + ((double) number1 / number2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case '%':
                if (number2 != 0) {
                    System.out.println("Remainder: " + (number1 % number2));
                } else {
                    System.out.println("Cannot find a remainder using zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}
