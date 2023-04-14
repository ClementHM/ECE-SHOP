package Vue;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML

    private HBox page_login;

    @FXML
    private Button bt_connexion;
    @FXML
    private Label label_titre;

    @FXML
    private Label label_email;

    @FXML
    private Label label_mdp;

    @FXML
    private Label label_pasdecompte;

    @FXML
    private Label label_employé;

    @FXML

    private Button bt_logemploye;
    @FXML
    private ImageView img_ece;

    @FXML
    private TextField tf_email;

    @FXML
    private PasswordField password;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        page_login.getBlendMode().getDeclaringClass();

    }

}

