package Vue.Controleur;

import Modele.DatabaseDao.ArticleDao;
import Modele.DatabaseDao.DaoFactory;
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

public class Stockcontroller implements Initializable {
    @FXML
    private TextArea ta_stock;

    @FXML
    private Button bt_retourlogin;


    private Stage stage;
    private Scene scene;
    private Parent root;
    // on affiche les stocks de chaque article dans la textarea
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String url1="jdbc:mysql://localhost:3306/shopping";
        String username="root";
        String password="abcdef";
        DaoFactory daoFactory = new DaoFactory(url1,username,password);
        ArticleDao articleDao = new ArticleDao(daoFactory);
        String txt =articleDao.stockemploye();
        ta_stock.setText(txt);


    }

    public void retourlogin(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Loginemploye.fxml"));
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
