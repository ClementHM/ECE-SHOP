package Controleur;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationEceShopping extends Application {


// on lance ece shopping
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Vue/Controleur/Login.fxml"));
        stage.setTitle("ECE Shopping");
        stage.setScene(new Scene(root,1200,700));
        stage.show();




    }

    public static void main(String[] args) {
        launch(args);

    }
}

