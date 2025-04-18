package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder addressInformation = new StringBuilder();
        //customer name
        System.out.print("Full name: ");
        String fullName = input.nextLine();
        addressInformation.append(fullName);

        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();
        addressInformation.append("BillingStreet");

        System.out.print("Billing City ");
        String billingCity = input.nextLine();
        addressInformation.append("Billing City");

        System.out.print("Billing State");
        String billingState = input.nextLine();
        addressInformation.append("Billing State");

        System.out.print("Billing Zip: ");
        String billingZip = input.nextLine();
        addressInformation.append("Billing Zip");

        System.out.print("shipping Street");
        String shippingStreet = input.nextLine();
        addressInformation.append("shipping Street");

        System.out.print("Shipping City");
        String ShippingCity = input.nextLine();
        addressInformation.append("Shipping City");

        System.out.print("shipping State: ");
        String ShippingState = input.nextLine();
        addressInformation.append("shipping State");

        System.out.print("shipping Zip: ");
        String shippingZip = input.nextLine();
        addressInformation.append("shipping Zip");


    }
}
