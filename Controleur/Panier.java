package Controleur;

import Modele.Table.Article;

import java.util.List;

public class Panier {
    public List<Article> Panier_article;
    private float total_prix;

    public List<Article> getPanier_article() {
        return Panier_article;
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

    public float AddPanier(Article article)
    {
        Panier_article.add(article);
        return article.getPrix();
    }
}
