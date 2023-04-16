package Modele;

import Modele.Table.Article;

import java.util.ArrayList;
import java.util.List;

//creer la classe panier qui sera utiliser dans le panier fxml
//c'est une list d'article
public class Panier {
    protected List<Article> Panier_article = new ArrayList<Article>();
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

    public void addPanier(Article article)
    {
        System.out.println("Ajouté au panier");
        Panier_article.add(article);
        this.total_prix+=article.getPrix();
    }


}
