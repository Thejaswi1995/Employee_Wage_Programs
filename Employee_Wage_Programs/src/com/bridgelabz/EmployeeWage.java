package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args) {
        final int empWagePerHour = 20;
        final int fullTimeHours = 8;
        System.out.println("Welcome to Employee wage problems");

        Random r = new Random();
        int attendance = r.nextInt(2);
        System.out.println("\nRandom value is: " + attendance);

        if (attendance == 1) {
            System.out.println("\nEmployee is Present");
            int dailyWage = empWagePerHour * fullTimeHours;
            System.out.println("wage for the day is " + dailyWage);
        } else {
            System.out.println("\nEmployee is Absent");
        }
    }
}



