package Héritage;

public class Enseignant extends Persone{
    public String speciality;
    public Enseignant (String nome, String prenom, String adresse, String ville, int dateNaissance, String specialty){
        super(nome, prenom,adresse,ville, dateNaissance);
        this.speciality = specialty;
    }
    @Override
    public void ecrirePersonne() {
        System.out.println(nome + " | " + prenom + " | " + dateNaissance + " | " + ville + " | " + ville+ " | " + dateNaissance + " | " + speciality);
    }
}
