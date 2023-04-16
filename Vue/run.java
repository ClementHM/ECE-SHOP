package Vue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//utilisercomme test pour l'affichage des onglets
public class run extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Controleur/Login.fxml"));
        stage.setTitle("ECE Shopping");
        stage.setScene(new Scene(root,1200,700));
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);

    }
}
