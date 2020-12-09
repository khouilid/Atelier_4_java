package Héritage;

public class Courant extends Epargne {

    @Override
    public void ajoute(double sold, long compteNumber) {
        if(sold > 200){
            setCompteNumber(compteNumber);
            setSold(sold);
        }else {
            System.out.println("Désolé, la valeur minimale du solde est 200 MAD");
        }


    }


}
