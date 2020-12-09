package Polymorphism;

public class Employe extends Persone {

    public int salaire;

    public Employe(String nome, String prenom, String adresse, String ville, int dateNaissance, int salaire) {
        super(nome, prenom, adresse, ville, dateNaissance);
        this.salaire = salaire;
    }
    public void Afficher(){
        System.out.println("Employe :" +nome + " | " + prenom + " | " + dateNaissance + " | " + ville + " | " + ville + " | " + dateNaissance+ " | " + salaire);
    }
}
