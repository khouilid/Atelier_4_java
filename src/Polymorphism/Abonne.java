package Polymorphism;

import java.util.HashMap;
import java.util.HashSet;

public class Abonne {
    HashSet<HashMap<String, Object>> abonms = new HashSet<>();


    public void setAbonm(String name, String id) {
        HashMap<String, Object> user = new HashMap<>();
        int abonm_id = abonms.size();
        user.put("Nom", name);
        user.put("ID", id);
        user.put("abonm id ", abonm_id + 1);
        user.put("Ouvrage", "Non");
        abonms.add(user);


    }
    public HashMap<String, Object> getAbmon(String name) {
        for (var abonm : abonms) {
            if (abonm.get("Nom") == name) {
                return abonm;

            }
        }
        return null;
    }
}
