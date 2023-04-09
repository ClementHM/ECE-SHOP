package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.InterfaceArticle;
import Modele.Table.Article;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao implements InterfaceArticle {
    private DaoFactory daoFactory;
    public ArticleDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }


    @Override
    public Article getArticleById(int id) {
        try {
            Connection connection = daoFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement
                    ("select * from article where id = ?");
            statement.setLong(1,id);

            ResultSet resultSet = statement.executeQuery();

            Article article = new Article();

            while (resultSet.next()){
                article.setId(resultSet.getInt("id"));
                article.setNom(resultSet.getString("nom"));
                article.setDescription(resultSet.getString("description"));
                article.setPrixunitaire(resultSet.getFloat("prix_unitaire"));
                article.setPrixgroupé(resultSet.getFloat("prix_groupé"));
                article.setQuantité_groupé(resultSet.getFloat("quantité_groupé"));

            }
            System.out.println(article);
            return article;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List <Article> lister (){
        List<Article> listearticles = new ArrayList<Article>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            rs= statement.executeQuery(("select* from article"));

            while(rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String description = rs.getString("description");
                float prixunitaire= rs.getInt("prix_unitaire");
                float prixgroupé= rs.getInt("prix_groupé");
                float quantitégroupé= rs.getInt("quantité_groupé");

                Article article =new Article();
                article.setId(id);
                article.setNom(nom);
                article.setDescription(description);
                article.setPrixunitaire(prixunitaire);
                article.setPrixgroupé(prixgroupé);
                article.setQuantité_groupé(quantitégroupé);

                listearticles.add(article);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Liste des articles: ");
        System.out.println("----------------------------------------------------");
        for (Article element: listearticles){
            System.out.println(element);
            System.out.println("----------------------------------------------------");


        }
        return listearticles;

    }

    }

