package Héritage;

public class ArticleEnSolde extends Article{
    private int sold;

    public ArticleEnSolde(int sold , String name, int price) {
        super(name, price);
        this.sold = sold;

    }

    @Override
    public void afficher(){
        System.out.println("le nouveau price de " + this.getName() + ":" + (this.getPrice() -  sold));
    }

}
