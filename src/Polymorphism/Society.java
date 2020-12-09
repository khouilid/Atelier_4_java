package Polymorphism;

public class Society {

    public Society(){
        Employe Emppolye = new Employe("ABDO", "khouilid", "dd", "sb", 2000, 2000);
        Emppolye.Afficher();
        Chef chef = new Chef("ABDO", "khouilid", "dd", "sb", 2000, "tech");
        chef.Afficher();
        Directeur Directeur= new Directeur("ABDO", "khouilid", "dd", "sb", 2000,"YouCode");
        Directeur.Afficher();
    }
}
