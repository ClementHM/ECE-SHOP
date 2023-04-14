package Vue;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class outil {
    public static void changeScene(javafx.event.ActionEvent event, String fxmlFile,String title, String email, String password){
        Parent root= null;
        if(email!=null && password!=null){
            try {
                FXMLLoader loader = new FXMLLoader(outil.class.getResource(fxmlFile));
                root = loader.load();
                signup signup = loader.getController();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            try {
                root = FXMLLoader.load(outil.class.getResource(fxmlFile));

            }catch (IOException e){
                e.printStackTrace();
            }
        }Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 800, 600));
        stage.show();
    }


}
