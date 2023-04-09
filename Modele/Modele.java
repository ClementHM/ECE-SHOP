package Modele;


import Modele.DatabaseDao.ArticleDao;
import Modele.DatabaseDao.DaoFactory;
import Modele.DatabaseDao.EmployéDao;

public class Modele {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/shopping";
        String username="root";
        String password="abcdef";
        DaoFactory daoFactory = new DaoFactory(url,username,password);
        ArticleDao article1 = new ArticleDao(daoFactory);
        article1.getArticleById(2);
        article1.lister();
        //EmployéDao employé= new EmployéDao(daoFactory);
        //employé.getEmployeById(2);
        //employé.lister();





        }
    }


