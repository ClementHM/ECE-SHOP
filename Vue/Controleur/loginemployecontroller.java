package Vue.Controleur;

import Modele.DatabaseDao.DaoFactory;
import Modele.DatabaseDao.EmployéDao;
import Modele.Table.Employé;
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
import java.util.List;
import java.util.ResourceBundle;


public class loginemployecontroller implements Initializable {

    @FXML
    private Button btconnexion;

    @FXML
    private Button btretourlogin;

    @FXML
    private TextField tf_email;
    @FXML
    private PasswordField pf_password;
    @FXML
    private Label labelerreur;

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

    public void connexionemploye (ActionEvent event) {
        String url = "jdbc:mysql://localhost:3306/shopping";
        String username = "root";
        String password = "abcdef";
        DaoFactory daoFactory = new DaoFactory(url, username, password);
        EmployéDao employéDao = new EmployéDao(daoFactory);
        List<Employé> ee = employéDao.lister();

        for (int i = 0; i < ee.size(); i++) {
            if ((ee.get(i).getEmail().equals(tf_email.getText())) && (ee.get(i).getMotdepasse().equals(pf_password.getText()))) {
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
            }else{
                labelerreur.setText("Mauvais mail ou mauvais mot de passe");
            }


        }
    }
}
