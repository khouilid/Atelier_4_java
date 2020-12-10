package Polymorphism;

import java.util.Date;


public class Bibliotheque {
    private Abonne abonms;

    public Bibliotheque() {
        abonms = new Abonne();
//        Ouvrage allOvrage = new Ouvrage();

    }

    //vidios
    public void set(String title, String date, String existe, String editeur, String reel, String id, String abonmid) {
        Video video = new Video();
        video.setOuvrage(title, date, existe, editeur, reel, id, abonmid);
        video.afficher(title);

    }

    public void set(String title, String date, String existe, String auteur, String id, String abonmid) {
        Livre livre = new Livre();
        livre.setOuvrage(title, date, existe, auteur, id, abonmid);
        livre.afficher(title);

    }

    //Abonms
    public void setabonme(String name, String id) {
        abonms.setAbonm(name, id);
    }

    public void getabonme(String name) {
        var user = abonms.getAbmon(name);

        for (var i : user.keySet()) {
            System.out.println(i + " : " + user.get(i));

        }

    }


}
