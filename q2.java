/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ekram
 */
import java.util.Random;

public class q2 {
     public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6);

        System.out.print(number + " is ");

        switch (number) {
            case 0:
                System.out.println("zero.");
                break;
            case 1:
                System.out.println("one.");
                break;
            case 2:
                System.out.println("two.");
                break;
            case 3:
                System.out.println("three.");
                break;
            case 4:
                System.out.println("four.");
                break;
            case 5:
                System.out.println("five.");
                break;
        }
    }
}
