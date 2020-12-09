package Polymorphism;

public class Directeur extends Persone{
    public String society;

    public Directeur(String nome, String prenom, String adresse, String ville, int dateNaissance, String society) {
        super(nome, prenom, adresse, ville, dateNaissance);
        this.society = society;
    }
    public void Afficher(){
        System.out.println("Directeur :" +nome + " | " + prenom + " | " + dateNaissance + " | " + ville + " | " + ville + " | " + dateNaissance+ " | " + society);
    }
}
