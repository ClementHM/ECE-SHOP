package Vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class createaccoundController implements Initializable {
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bt_retourlogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //outil.changeScene(event ,"creationcompte.fxml","Creation de compte",null,null);


            }
        });

    }
}
