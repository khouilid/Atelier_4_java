package Polymorphism;


import java.util.HashMap;
import java.util.HashSet;

public class Ouvrage {

    HashSet<HashMap<String, String>> ouvrages = new HashSet<>();

    public void setOuvrage(String title, String date, String existe, String id) {
        HashMap<String, String> user = new HashMap<>();
        user.put("userID", id);
        user.put("Title", title);
        user.put("Date", date);
        user.put("Desponible", existe);
        this.ouvrages.add(user);
    }

    public String afficher(String title) {
        for (var ouvarge : ouvrages) {
            var titl = ouvarge.get("Title");
            if (titl.equals(title)) {
                return "Title: " + ouvarge.get("Title") + " la date de création : " + ouvarge.get("Date") + " Desponible : " + ouvarge.get("Desponible");
            } else return null;

        }
        return null;
    }
}
