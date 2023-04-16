package Modele.DatabaseDao.Interfaces;

import Modele.Table.Article;

import java.util.List;


public interface InterfaceArticle {
    public Article getArticleById(int id);
    List<Article> lister();
    public String stockemploye();

}
