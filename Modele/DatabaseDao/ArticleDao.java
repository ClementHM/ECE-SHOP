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

//permet d'avoir un article en tapant son id
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
                article.setPrix(resultSet.getFloat("prix"));
                article.setQuantité(resultSet.getFloat("quantité"));
                article.setCatégorie(resultSet.getString("categorie"));
                article.setStock(resultSet.getInt("stock"));

            }
            //System.out.println(article);
            return article;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //retourne tous les articles dans la bdd
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
                float prix= rs.getInt("prix");
                float quantité= rs.getInt("quantité");
                String catégorie= rs.getString("categorie");
                int stock =rs.getInt("stock");
                int remise= rs.getInt("remise");
                String image =rs.getString("image");


                Article article =new Article();
                article.setId(id);
                article.setNom(nom);
                article.setDescription(description);
                article.setPrix(prix);
                article.setQuantité(quantité);
                article.setCatégorie(catégorie);
                article.setStock(stock);
                article.setRemise(remise);

                listearticles.add(article);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //System.out.println("Liste des articles: ");
        //System.out.println("----------------------------------------------------");
        for (Article element: listearticles){
            //System.out.println(element);
            //System.out.println("----------------------------------------------------");


        }
        return listearticles;

    }
//permet de fixer un nv stock lorsqu'on paye
    public void updatestock(String nom, int newstock){
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = daoFactory.getConnection();
            String sql = "UPDATE article SET stock = ? WHERE nom = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, newstock);
            stmt.setString(2, nom);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //utiliser pour affiche le stock par article
    public String stockemploye(){
        Connection connection =null;
        Statement statement =null;
        List<String> test = new ArrayList<String>();
        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            String query = "SELECT nom, stock FROM article";
            ResultSet rs = statement.executeQuery(query);
            String txt = null;
            while (rs.next()) {
                String nom = rs.getString("nom");
                int stock = rs.getInt("stock");
                txt = "-"+ "Nom article:" + nom + " \t" + "\t" + "|Stock :" + stock +"\n";
                test.add(txt);

            }
            return test.toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    }


