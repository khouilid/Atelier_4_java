package Employe;

import java.util.Scanner;

public class Test {

    Scanner input = new Scanner(System.in);

    public Test() {

        var employe = new EmployeProfile();

        System.out.println("Set new employe.");
        System.out.print("Empolye first name :");
        String fname = input.next();
        System.out.print("Empolye last name :");
        String lname = input.next();

        System.out.print("Empolye adress :");
        String adress = input.next();

        System.out.print("Empolye birthday year :");
        int birthYear = input.nextInt();

        employe.setEmploye(fname, lname, adress, birthYear);

        System.out.println(employe.afficherInfosClient());


    }
}
