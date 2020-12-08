package Employe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employe {

    private String firstName;
    private String lastName;
    private String adress;
    private int birthdayYear;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public Employe() {

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdaDay) {
        this.birthdayYear = birthdaDay;
    }


}
