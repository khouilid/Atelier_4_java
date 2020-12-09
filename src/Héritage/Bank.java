package Héritage;

import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in);

    public void bank() {


        System.out.println("Your order : ");
        System.out.println("1 -> compte épargne ");
        System.out.println("1 -> compte courant ");
        int inputs = input.nextInt();
        if (inputs == 1) {
            Epargne compte = new Epargne();
            account(compte);
        } else if (inputs == 2) {
            Courant compte = new Courant();
            account(compte);
        }


    }


    private void account(Epargne compte) {

        String[] exercices = {"1 -> Ajouter", "2 -> Retirer",
                "3 -> Afficher"};

        for (String exercice : exercices) {
            System.out.println(exercice);
        }
        int inputs = input.nextInt();
        if (inputs == 1) {
            System.out.print("compte number : ");
            long compteNumber = input.nextLong();

            System.out.print("Amount : ");
            double sold = input.nextDouble();

            compte.ajoute(sold, compteNumber);

        } else if (inputs == 2) {
            System.out.print("Amount : ");
            double sold = input.nextDouble();
            compte.Retirer(sold);
        } else if (inputs == 3) {
            compte.affiche();
        }
        account(compte);
    }
}
