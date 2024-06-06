package se.johan;

import java.util.Scanner;

public class Task5_HelloUserNameInput {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("What is your name?");

        String yourName = name.nextLine();

        System.out.println("Hello "+ yourName + "!");
    }
}
