/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    public String checkInputOperator() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty, please");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+ , - , * , / , ^ , =)");
            }
            System.out.println("Enter again: ");
        }
    }
    
    public int inputInt(String mess, int min) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min) {
                    System.out.print("Please input over " + min + " : ");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }

    public double inputDouble(String mess) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Please input an double number: ");
            }
        }
    }
}
