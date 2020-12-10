package com.khouilid;


import Héritage.*;
import Polymorphism.Bibliotheque;
import Polymorphism.Society;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//
//        var artSold = new ArticleEnSolde(3, "abdo ", 200);
//        artSold.afficher();
//        var b =  new Courant();
//        b
        //display choices
        String[] exercises = {"1 -> Exercice 1", "2 -> Exercice 2", "3 -> Exercice 3 & 4 & 5 & 5"};
        for (String exercise : exercises) {
            System.out.println(exercise);
        }
        //get input value
        Scanner list_input = new Scanner(System.in);
        System.out.print("Please choose a number : ");
        int exe_number = list_input.nextInt();


        System.out.println("You choose exercise : " + exe_number);
        //check the user choice and display result
        if (exe_number == 1) {

            var art = new Article("abdo", 200);
            art.afficher();
            var artSold = new ArticleEnSolde(3, "abdo ", 200);
            artSold.afficher();

        } else if (exe_number == 2) {
            Epargne compte = new Epargne();
            Bank bnk = new Bank();
            bnk.bank();


        } else if (exe_number == 3) {
            new School();

        } else if (exe_number == 4) {
            new Society();


        } else if (exe_number == 5) {
            var bibliotic = new Bibliotheque();
            bibliotic.setabonme("ABDO", "2222");
            bibliotic.getabonme("ABDO");
            bibliotic.set("A", "122", "Non", "ak", "1.1", "2", "1");
            bibliotic.set("A", "122", "Non", "ak", "1.1", "2", "1");

//

        }
    }


}
