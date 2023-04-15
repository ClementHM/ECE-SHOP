package Vue.Controleur;

import Modele.DatabaseDao.ArticleDao;
import Modele.DatabaseDao.DaoFactory;
import Modele.Panier;
import Modele.Table.Article;
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
import java.util.List;
import java.util.ResourceBundle;

public class paniercontroller implements Initializable {
    @FXML
    private Button btretourshopping;

    @FXML
    private TextArea tx_area;

    @FXML
    private Button bt_payer;




    private Stage stage;
    private Scene scene;
    private Parent root;
    private Panier panier;

    private String txt;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void retourshopping (ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Shopping.fxml"));
            root = loader.load();
            Shopping test = loader.getController();
            test.getPanier2(panier);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void payer(){
        ArticleDao articleDao =new ArticleDao(DaoFactory.getInstance());
        List<Article> cc = panier.getPanier_article();
        for (int i=0; i<cc.size();i++){
            int newstocck=cc.get(i).getStock()-1;
            cc.get(i).setStock(newstocck);
            String nom = cc.get(i).getNom();
            articleDao.updatestock(nom,newstocck);
        }
        tx_area.setText(null);

    }

    public void getPanier(Panier panier){
        this.panier=panier;
        String texte = "";
        List<Article> cc = panier.getPanier_article();
        for(int i = 0;i<cc.size();i++){
            texte +="-"+" Nom " +cc.get(i).getNom()+" Type: "+cc.get(i).getCatégorie()+" Description:  "+cc.get(i).getDescription()+" Prix : "+cc.get(i).getPrix()+" € "+"\n";
        }
        tx_area.setText(texte);
        txt=texte;




    }






}
