package Héritage;

public class Epargne {

    protected double sold;
    protected long compteNumber;


    public void ajoute(double sold, long compteNumber) {
        setCompteNumber(compteNumber);
        setSold(sold);
    }

    public void Retirer(double amount) {
        sold = sold - amount;
        affiche();

    }

    public void affiche(){
        System.out.println(getCompteNumber() + " -> " + getSold());
    }

    public long getCompteNumber() {
        return compteNumber;
    }

    public void setCompteNumber(long compteNumber) {
        this.compteNumber = compteNumber;
    }


    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }


}
