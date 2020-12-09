package Héritage;

public class Article {
    private String name;
    private int price;

    public Article(String name , int price) {
        setName(name);
        setPrice(price);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void afficher() {
        System.out.println("le price de " + name + ":" + price);
    }
}
