package com.pluralsight;
import java.util.Scanner;
public class Fullnameappliaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //names
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter your middle name : ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Enter your suffix : ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;
        if (middleName.equals("")){
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if (!suffix.equals("")){
            fullName += "," + suffix;
        }
       System.out.println("Full name: " + fullName);



    }

}
