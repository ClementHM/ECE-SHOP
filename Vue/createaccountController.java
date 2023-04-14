package Vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class createaccountController implements Initializable {
    @FXML
    private Button bt_creercompte;

    @FXML
    private Button bt_retourlogin;

    @FXML
    private PasswordField mdp;

    @FXML
    private TextField tf_nvnomclient;

    @FXML
    private TextField tf_nvprenomclient;
    @FXML
    private TextField tf_nvadresseclient;
    @FXML
    private TextField tf_nvemailclient;

    @FXML
    private Label labelconnexion;


    private Stage stage;
    private Scene scene;
    private Parent root;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
    public void retourlogin (ActionEvent event){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}