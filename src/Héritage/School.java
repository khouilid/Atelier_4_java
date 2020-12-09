package Héritage;

public class School {

    public School() {
        preson();
        System.out.println("---------------------------------------------------");
        student();
        System.out.println("---------------------------------------------------");
        secretaire();
        System.out.println("---------------------------------------------------");
        nnsiagnent();

    }

    public void preson() {
        var person = new Persone("ABDO", "KHOUILID", "youssofia", "youssofia", 2000);
        person.ecrirePersonne();
        person.modifiePersonne("sidi bennour", "sid bennour");
        person.toString();
    }

    public void student() {
        var person = new Etudiant("ABDO", "KHOUILID", "youssofia", "youssofia", 2000,"YOUCODE");
        person.ecrirePersonne();
        person.modifiePersonne("sidi bennour", "sid bennour");
        person.toString();
    }

    public void secretaire() {
        var person = new Secretaire("ABDO", "KHOUILID", "youssofia", "youssofia", 2000, 21);
        person.ecrirePersonne();
        person.modifiePersonne("sidi bennour", "sid bennour");
        person.toString();
    }

    public void  nnsiagnent() {
        var person = new Enseignant("ABDO", "KHOUILID", "youssofia", "youssofia", 2000, "MAth");
        person.ecrirePersonne();
        person.modifiePersonne("sidi bennour", "sid bennour");
        person.toString();
    }

}
