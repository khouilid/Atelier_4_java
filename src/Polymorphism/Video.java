package Polymorphism;

import java.util.HashMap;

public class Video extends Ouvrage {

    public void setOuvrage(String title, String date, String existe, String editeur, String reel, String id, String abonmid) {
        HashMap<String, String> user = new HashMap<>();

        if (!isExest(title)) {
            user.put("ID", id);
            user.put("Title", title);
            user.put("Auteur", editeur);
            user.put("Reel", reel);
            user.put("Date", date);
            user.put("Desponible", existe);
            user.put("user_id", abonmid);
            this.ouvrages.add(user);
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
                return " L'editeur: " + ouvarge.get("Auteur") + " Reel :" + ouvarge.get("Reel");
            }
        }
        return null;
    }

    public String afficher(String title) {
        if (super.afficher(title) != null) {
            return super.afficher(title) + getAuteur(title);
        }
        return "Délolé, cette ouvrage né pas disponilbe.";
    }
}