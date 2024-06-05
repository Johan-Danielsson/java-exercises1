package se.johan;

import java.util.Scanner;

public class Task2_LeapYear {

    public static void main(String[] args) {
    /*
     To check if it's a leap year, divide the year by 4.
     If it's fully dividable by 4 it is a leap year. But some years
     like century years like 1900 2000 needs to be divided by 100 or 400
     to check if they are leap years. So we need to run more than one
     check for this.
     */

        //Added Scanner to take year as input
        Scanner input = new Scanner(System.in);

        System.out.println("Check if a year is a leap year!");
        System.out.println("Please enter the year to check:");

        int year = input.nextInt();

        // bloolean to check if result is true
        boolean isLeapYear;

        // first check, is it evenly dividable by 4?
        isLeapYear = (year % 4 == 0);

        //second check, divisible by 4, not by 100, or divisible by 400
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

