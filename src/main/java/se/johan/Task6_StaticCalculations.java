package se.johan;

import java.util.Scanner;

public class Task6_StaticCalculations {
    public static void main(String[] args) {
        //This program will ask for 2 inputs of numbers
        // and calculate addition, subtraction, multiplication
        // and dividing of said numbers

        //First, add adding a scanner to take user inputs
        Scanner input = new Scanner(System.in);
        System.out.println("This program will take two numbers and run additions, subtractions, multiplications and divisions of said numbers.");
        System.out.println("Please enter the first number:");
        double num1 = input.nextDouble();
        System.out.println("Please enter the second number");
        double num2 = input.nextDouble();

        // Addition
        double addAnswer = num1 + num2;
        System.out.println("Addition: "+num1+ "+" +num2+ "="+ addAnswer);
        // Subtraction
        double subAnswer = num1 - num2;
        System.out.println("Subtraction: "+num1+ "-" +num2+ "="+ subAnswer);
        // Multiplication
        double multiAnswer = num1 * num2;
        System.out.println("Multiplication: "+num1+ "*" +num2+ "="+ multiAnswer);
        // Division
        double divAnswer = num1 / num2;
        System.out.println("Division: "+num1+ "/" +num2+ "="+ divAnswer);
    }
}
