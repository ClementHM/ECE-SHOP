package Vue.Controleur;

import Modele.DatabaseDao.ClientDao;
import Modele.DatabaseDao.DaoFactory;
import Modele.Table.Client;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
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
    private PasswordField pf_password;

    @FXML
    private Label labelerreur;

    private Stage stage;
    private Scene scene;
    private Parent root;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void nvcomptebouton (ActionEvent event){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("creationcompte.fxml"));
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void loginemploye (ActionEvent event){

        try {FXMLLoader loader = new FXMLLoader(getClass().getResource("Loginemploye.fxml"));
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void connexionbouton(ActionEvent event){
        String url="jdbc:mysql://localhost:3306/shopping";
        String username="root";
        String password="abcdef";

        DaoFactory daoFactory = new DaoFactory(url,username,password);
        ClientDao clientDao = new ClientDao(daoFactory);
        List<Client> cc =clientDao.Connexion();


        for (int i=0;i<cc.size();i++){
            if ((cc.get(i).getEmail().equals(tf_email.getText() ) )&& (cc.get(i).getPassword().equals(pf_password.getText()))){
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Shopping.fxml"));
                    root = loader.load();
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } else {
                labelerreur.setText("Mauvais mail ou mauvais mot de passe");
            }

            }






    }

}



