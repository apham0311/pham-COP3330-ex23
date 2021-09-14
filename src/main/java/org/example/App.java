package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String silentCar = myApp.readInput("Is the car silent when you turn the key? ");
        String solution = myApp.solveProblem(silentCar);
        myApp.printSolution(solution);
    }

    public void printSolution(String solution) {
        System.out.println(solution);
    }

    public String solveProblem(String silentCar) {
        if (silentCar.equalsIgnoreCase("y")) {
            String answer1 = readInput("Are the battery terminals corroded? ");
            if (answer1.equalsIgnoreCase("y")) {
                return "Clean terminals and try starting again.";
            } else {
                return "Replace cables and try again.";
            }
        } else {
            String answer2 = readInput("Does the car make a slicking noise?");
            if (answer2.equalsIgnoreCase("y")) {
                return "Replace the battery";
            } else {
                String answer3 = readInput("Does the engine start and then die? ");
                if (answer3.equalsIgnoreCase("y")) {
                    String answer4 = readInput("Does your car have fuel injection? ");
                    if (answer4.equalsIgnoreCase("y")) {
                        return "Get it in for service";
                    } else {
                        return "Check to ensure the choke is opening and closing.";
                    }
                } else {
                    return "This should not be possible";
                }
            }
        }
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }
}
