package Vue;


import Modele.DatabaseDao.ArticleDao;
import Modele.DatabaseDao.DaoFactory;
import Modele.Panier;
import Modele.Table.Article;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;

public final class Shopping extends Application {

    Panier panier;

    public void affichage(ActionEvent event)
    {
        System.out.println("Bouton");
        //System.out.println(articleDao.getArticleById(1));

    }
    @Override
    public void start(final Stage primaryStage) {
        try {
            // Localisation du fichier FXML.
            final URL url = getClass().getResource("Shopping.fxml");
            // Création du loader.
            final FXMLLoader fxmlLoader = new FXMLLoader(url);
            // Chargement du FXML.
            final AnchorPane root = (AnchorPane) fxmlLoader.load();
            // Création de la scène.
            final Scene scene = new Scene(root, 800, 600);
            primaryStage.setScene(scene);
        } catch (IOException ex) {
            System.err.println("Erreur au chargement: " + ex);
        }
        primaryStage.setTitle("Test FXML");
        primaryStage.show();
    }

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/shopping";
        String username="root";
        String password="abcdef";
        DaoFactory daoFactory = new DaoFactory(url,username,password);
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
        ArticleDao articleDao=new ArticleDao(daoFactory);

        articleDao.getArticleById(1);
        articleDao.getArticleById(2);

        launch(args);
    }
}

