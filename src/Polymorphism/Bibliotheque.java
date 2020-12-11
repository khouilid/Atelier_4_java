package Polymorphism;

import java.util.Date;


public class Bibliotheque {
    private Abonne abonms;

    public Bibliotheque() {
        abonms = new Abonne();
    }

    //vidios
    public void set(Video video, String title, String date, String existe, String editeur, String reel, String id, String abonmid) {

        video.setOuvrage(title, date, existe, editeur, reel, id, abonmid);


    }
    public void getOuvre(Ouvrage ouvrage, String title){
        System.out.println(ouvrage.afficher(title));
    }

    public void set(Livre livre, String title, String date, String existe, String auteur, String id, String abonmid) {

        livre.setOuvrage(title, date, existe, auteur, id, abonmid);
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
