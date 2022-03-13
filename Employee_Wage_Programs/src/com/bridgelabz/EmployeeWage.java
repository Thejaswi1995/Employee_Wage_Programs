package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
        public static void main(String[] args) {
            System.out.println("Welcome to Employee wage problems");
                Random r = new Random();
                int attendance = r.nextInt(2);
                System.out.println("\nRandom value is: " +attendance);

                if (attendance == 1) {
                    System.out.println("\nEmployee is Present");
                } else {
                    System.out.println("\nEmployee is Absent");
                }
        }
    }

