package Héritage;

public class Etudiant extends Persone{
    public String diplome;
    public Etudiant(String nome, String prenom, String adresse, String ville, int dateNaissance, String diplome){
        super(nome, prenom,adresse,ville, dateNaissance);
        this.diplome = diplome;
    }
    @Override
    public void ecrirePersonne() {
        System.out.println(this.nome + " | " + prenom + " | " + dateNaissance + " | " + ville + " | " + ville+ " | " + dateNaissance + " | " + this.diplome);
    }
}
