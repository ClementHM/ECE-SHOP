package Modele;


import Modele.DatabaseDao.*;
//test pour les fonctions de la bdd
public class Modele {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/shopping";
        String username="root";
        String password="abcdef";
        DaoFactory daoFactory = new DaoFactory(url,username,password);
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());

        ArticleDao article1 = new ArticleDao(daoFactory);
        article1.getArticleById(2);
       // article1.lister();
        //EmployéDao employé= new EmployéDao(daoFactory);
        //employé.getEmployeById(2);
        //employé.lister();
        CommandeDao commande = new CommandeDao(daoFactory);
        //commande.CommandeClient(5);
        DetailcoDao detailcoDao = new DetailcoDao(daoFactory);
        //detailcoDao.CommandeParArticle(5);
        //commande.saveCommande(timestamp, 5, 100, 1);
        ClientDao clientDao =new ClientDao(daoFactory);
        //clientDao.saveClient("nom", "prénom", "adresse", "ville", "pays","email");
        //clientDao.Connexion();
        Panier panier = new Panier();
        String txt=null;
        article1.stockemploye();










        }
    }


