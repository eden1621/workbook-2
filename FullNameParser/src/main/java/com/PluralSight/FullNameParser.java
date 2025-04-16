
import javax.lang.model.element.Name;
import java.util.Scanner;
package com.PluralSight;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full name");
        String fullName = scanner.nextLine().trim();
        String[] fullNamesplit = fullName.split(" +");
        if (fullName.length == 3){
            firstNAme = fullName[0];
            middleName = fullName[1];
            lastName = fullName[2];
            if(middleName.equalsIgmoreCase(" "))
                System.out.printf("%s, %s%n",lastName, firstName);{

            }
        }else{
            System.out.println("FullName: + ");
        }


    }
}
