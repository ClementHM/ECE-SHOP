package Vue.Controleur;

import Modele.Panier;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class paniercontroller implements Initializable {
    @FXML
    private Button btretourshopping;

    @FXML
    private TextArea tx_area;




    private Stage stage;
    private Scene scene;
    private Parent root;
    private Panier panier;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
    public void retourshopping (ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Shopping.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }





}
