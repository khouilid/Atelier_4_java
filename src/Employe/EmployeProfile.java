package Employe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeProfile {
    private Employe employe;
    private String currentYear;


    public EmployeProfile() {
        this.employe = new Employe();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        currentYear = formatter.format(new Date());

    }

    public void setEmploye(String firstName, String lastName, String adress, int birthdayYear) {
        employe.setFirstName(firstName);
        employe.setLastName(lastName);
        employe.setAdress(adress);
        employe.setBirthdayYear(birthdayYear);
        employe.setAge(calculerAge(birthdayYear));

    }


    private int calculerAge(int birthdayYear) {
        return Integer.parseInt(currentYear) - birthdayYear;

    }

    public String afficherInfosClient() {
        return new StringBuilder().append(employe.getFirstName()).append(" | ").append(employe.getLastName()).append(" | ").append(employe.getAdress()).append(" | ").append(employe.getBirthdayYear()).append(" | ").append(employe.getAge()).toString();
    }

}
