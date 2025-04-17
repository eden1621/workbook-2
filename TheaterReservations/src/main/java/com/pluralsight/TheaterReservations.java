package com.pluralsight;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
       //Fullname
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();
        //show date
        System.out.print("Enter the date of the show: ");
        String showDate = scanner.nextLine();
        //number of tickets
        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();
        //full name
        String[] nameParts = fullName.trim().split("\\s+");
        String formattedName;
        if (nameParts.length >= 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1];
            formattedName = lastName + ", " + firstName;
        }else{
            formattedName = nameParts[0];
            System.out.println("\nIncorrect name format: Enter your first and last name!");


    }
}
}
