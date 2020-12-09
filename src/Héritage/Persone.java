package Héritage;

public class Persone {
    public String nome, prenom, adresse, ville;
    public int dateNaissance;

    public Persone(String nome, String prenom, String adresse, String ville, int dateNaissance) {
        this.adresse = adresse;
        this.nome = nome;
        this.dateNaissance = dateNaissance;
        this.prenom = prenom;
        this.ville = ville;


    }


    @Override
    public String toString() {
        return nome + prenom;
    }

    public void modifiePersonne(String adresse, String ville) {
        this.adresse = adresse;
        this.ville = ville;
        ecrirePersonne();
    }

    public void ecrirePersonne() {
        System.out.println(nome + " | " + prenom + " | " + dateNaissance + " | " + ville + " | " + ville + " | " + dateNaissance);
    }
}
