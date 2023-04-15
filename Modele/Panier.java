package Modele;

import Modele.Table.Article;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    public List<Article> Panier_article = new ArrayList<Article>();
    private float total_prix;

    public List<Article> getPanier_article() {

        return getPanier_article();
    }




    public void setPanier_article(List<Article> panier_article) {
        Panier_article = panier_article;
    }

    public float getTotal_prix() {
        return total_prix;
    }

    public void setTotal_prix(float total_prix) {
        this.total_prix = total_prix;
    }

    public void addPanier(Article article)
    {
        System.out.println("Ajouté au panier");
        Panier_article.add(article);
        this.total_prix+=article.getPrix();
    }

    public String affichagepanier (){
        System.out.println("Liste des articles dans le panier:");
        System.out.println("----------------------------------------------------");
        for (Article element : Panier_article) {
            System.out.println(element);
            System.out.println("----------------------------------------------------");
        }
        return null;
    }
}
