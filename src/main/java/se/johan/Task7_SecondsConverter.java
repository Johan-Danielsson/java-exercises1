package se.johan;

import java.util.Scanner;

public class Task7_SecondsConverter {
    public static void main(String[] args) {

        // This program will convert seconds into hours, minutes and seconds

        //First of all, we add a Scanner for user input to get the value
        Scanner input = new Scanner(System.in);

        System.out.println("This program will convert seconds into hours, minutes and seconds.");
        System.out.println("Please add how many seconds you want to convert:  ");
        int seconds = input.nextInt();

        // Calculate into hours, minutes and seconds
        int S = seconds % 60;   // calculate remaining seconds <-- Ask Mehrdad about some clarification
        int H = seconds / 60;   // convert total seconds to minutes
        int M = H % 60;         // calculate remaining minutes
        H = H / 60;             // convert total minutes to hours

        // Show result in the correct format HH:MM:SS
        System.out.println(H + " Hours");
        System.out.println(M + " Minutes");
        System.out.println(S + " Seconds");
        System.out.println("In short: ");
        System.out.println(H + ":" + M + ":" + S);
    }
}
