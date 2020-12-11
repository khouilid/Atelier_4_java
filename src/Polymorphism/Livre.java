package Polymorphism;

import java.util.Date;
import java.util.HashMap;

public class Livre extends Ouvrage {


    public void setOuvrage(String title, String date, String existe, String auteur, String id, String abonmid) {
        HashMap<String, String> user = new HashMap<>();

        if (!isExest(abonmid)) {
            user.put("ID", id);
            user.put("Title", title);
            user.put("Auteur", auteur);
            user.put("Date", date);
            user.put("Desponible", existe);
            user.put("user_id", abonmid);
            this.ouvrages.add(user);
        } else System.out.println("Délolé, cette abonne déja prenge une ouvrage.");


//        afficher(title);


    }


    private boolean isExest(String abonmid) {
        for (var ouvarge : this.ouvrages) {

            return !ouvarge.get("user_id").equals(abonmid);
        }
        return false;
    }

    private String getAuteur(String tittle) {
        for (var ouvarge : this.ouvrages) {

            if (ouvarge.get("Title").equals(tittle)) {
                return ouvarge.get("Title");
            }
        }
        return null;
    }

    public String afficher(String title) {
        if (super.afficher(title) != null) {
            return super.afficher(title) + " | L'Auteur: " + getAuteur(title);
        }
        return "Délolé, cette ouvrage né pas disponilbe.";
    }
}
