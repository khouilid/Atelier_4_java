package Polymorphism;

import java.util.Date;
import java.util.HashMap;

public class Livre extends Ouvrage {


    public void setOuvrage(String title, String date, String existe, String auteur, String id, String abonmid) {
        HashMap<String, String> user = new HashMap<>();

        if (!isExest(title)) {
            user.put("ID", id);
            user.put("Title", title);
            user.put("Auteur", auteur);
            user.put("Date", date);
            user.put("Desponible", existe);
            user.put("user_id", abonmid);
            this.ouvrages.add(user);
            System.out.println("Done!");

        } else System.out.println("Délolé, cette abonne déja prenge une ouvrage.");
    }


    private boolean isExest(String title) {
        for (var ouvarge : this.ouvrages) {

            return ouvarge.get("Title").equals(title);

        }

        return false;
    }

    private String getAuteur(String tittle) {
        for (var ouvarge : this.ouvrages) {

            if (ouvarge.get("Title").equals(tittle)) {
                return ouvarge.get("Auteur");
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
