package com.pluralsight;
import java.util.Scanner;


public class FullNameParser {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your full name");
            String fullName = scanner.nextLine().trim();
            String[] input = fullName.split("\\s+");

            String firstName = "";
            String middleName = "";
            String lastName = "";

            if (input.length == 2) {
                firstName = input[0];
                lastName = input[1];
            } else if (input.length == 3) {
                firstName = input[0];
                middleName = input[1];
                lastName = input[2];
            } else {
                System.out.println("Invalid input");
                return;
            }
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        }

    }


