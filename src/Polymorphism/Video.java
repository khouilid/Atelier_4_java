package Polymorphism;

import java.util.HashMap;

public class Video extends Ouvrage {

    public void setOuvrage(String title, String date, String existe, String editeur, String reel, String id, String abonmid) {
        HashMap<String, String> user = new HashMap<>();

            if (!isExest(abonmid)) {
                user.put("ID", id);
                user.put("Title", title);
                user.put("Auteur", editeur);
                user.put("Reel", reel);
                user.put("Date", date);
                user.put("Desponible", existe);
                user.put("user_id", abonmid);
                this.ouvrages.add(user);
            } else System.out.println("Délolé, cette abonne déja prenge une ouvrage.");



//        afficher(title);
        System.out.println(affich(title));


    }
    private boolean isExest(String abonmid){
        for (var ouvarge : this.ouvrages) {

            return !ouvarge.get("user_id").equals(abonmid);

        }

        return false;
    }
    @Override
    public String affich(String title) {
        return super.affich(title) + "HRLLO";
    }

    public void afficher(String title) {
        for (var ouvarge : this.ouvrages) {
            String titl = ouvarge.get("Title");
            if (titl.equals(title)) {
                System.out.println("Title: " + ouvarge.get("Title") + "| L'editeur: " + ouvarge.get("Auteur") + " | Reel :" + ouvarge.get("Reel") + " | la date de création :" + ouvarge.get("Date") + " | Desponible : " + ouvarge.get("Desponible"));
            } else System.out.println("Délolé, cette ouvrage né pas disponilbe.");

        }
    }
}