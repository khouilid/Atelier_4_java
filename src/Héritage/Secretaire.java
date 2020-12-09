package Héritage;

public class Secretaire extends Persone{
    public int bureau;
    public Secretaire (String nome, String prenom, String adresse, String ville, int dateNaissance, int numeroBureau){
        super(nome, prenom,adresse,ville, dateNaissance);
        this.bureau = numeroBureau;
    }


    @Override
    public void ecrirePersonne() {
        System.out.println(nome + " | " + prenom + " | " + dateNaissance + " | " + ville + " | " + ville+ " | " + dateNaissance + " | " + bureau);
    }
}
