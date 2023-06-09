package Vue.Controleur;


import Modele.DatabaseDao.ArticleDao;
import Modele.DatabaseDao.DaoFactory;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Shopping implements Initializable {
    @FXML
    private Button fruit;

    @FXML
    private Button Légumes;
    @FXML
    private Button ajouter;

    @FXML
    private Text Article1;
    @FXML
    private Text Article2;
    @FXML
    private Text Article3;
    @FXML
    private Text Article4;
    @FXML
    private Text Article5;
    @FXML
    private Text Article6;
    @FXML
    private Text Article7;
    @FXML
    private Text Article8;
    @FXML
    private Text Article9;
    @FXML
    private Text Article10;
    @FXML
    private Text Article11;
    @FXML
    private Text Article12;
    @FXML
    private Text Article13;
    @FXML
    private Text Article14;
    @FXML
    private Text Article15;
    @FXML
    private Text Article16;
    @FXML
    private Text Article17;
    @FXML
    private Text Article18;
    @FXML
    private Text Article19;
    @FXML
    private Text Article20;
    @FXML
    private Text Article21;
    @FXML
    private Text Article22;
    @FXML
    private Text Article23;
    @FXML
    private Text Article24;
    @FXML
    private Text Article25;
    @FXML
    private Text Article26;
    @FXML
    private Text Article27;
    @FXML
    private Text Article28;
    @FXML
    private Text Article29;
    @FXML
    private Text Article30;
    @FXML
    private Text Article31;
    @FXML
    private Text Article32;

    @FXML
    private Button btpanier;
    @FXML
    private TextArea tx_area;


    private Panier panier;
    private ArticleDao articleDao;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String texte = "";

    //permet d'afficher les infos des produits au dessus de chaque bouton correspondant

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String url1 = "jdbc:mysql://localhost:3306/shopping";
        String username = "root";
        String password = "abcdef";
        DaoFactory daoFactory = new DaoFactory(url1, username, password);
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
        this.panier = new Panier();
        this.articleDao = new ArticleDao(daoFactory);
        float prix = articleDao.getArticleById(1).getPrix();
        String nom= articleDao.getArticleById(1).getNom();
        float quantite= articleDao.getArticleById(1).getQuantité();
        if(Article1!=null)
        {
            Article1.setText(nom+"("+quantite+"):"+String.valueOf(prix)+"€");
        }
        // Augmenter de 1 à chaque fois jusqu'à la ligne 37
        for (int i = 2; i <= 37; i++) {
            prix = this.articleDao.getArticleById(i).getPrix();
            nom= articleDao.getArticleById(i).getNom();
            quantite= articleDao.getArticleById(i).getQuantité();

            if (i == 2) {
                if(Article2!=null )
                {
                    Article2.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            }
            if (i == 3) {
                if(Article3!=null )
                {
                    Article3.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 4) {
                if(Article4!=null )
                {
                    Article4.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 5) {
                if(Article5!=null )
                {
                    Article5.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 6) {
                if(Article6!=null )
                {
                    Article6.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 7) {
                if(Article7!=null )
                {
                    Article7.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 8) {
                if(Article8!=null )
                {
                    Article8.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 9) {
                if(Article9!=null )
                {
                    Article9.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 10) {
                if(Article10!=null )
                {
                    Article10.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 11) {
                if(Article11!=null )
                {
                    Article11.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 12) {
                if(Article12!=null )
                {
                    Article12.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 13) {
                if(Article13!=null )
                {
                    Article13.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 14) {
                if(Article14!=null )
                {
                    Article14.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 15) {
                if(Article15!=null )
                {
                    Article15.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 16) {
                if(Article16!=null )
                {
                    Article16.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 17) {
                if(Article17!=null )
                {
                    Article17.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 18) {
                if(Article18!=null )
                {
                    Article18.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 19) {
                if(Article19!=null )
                {
                    Article19.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 20) {
                if(Article20!=null )
                {
                    Article20.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 21) {
                if(Article21!=null )
                {
                    Article21.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 22) {
                if(Article22!=null )
                {
                    Article22.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 23) {
                if(Article23!=null )
                {
                    Article23.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 24) {
                if(Article24!=null )
                {
                    Article24.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 25) {
                if(Article25!=null )
                {
                    Article25.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 26) {
                if(Article26!=null )
                {
                    Article26.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 27) {
                if(Article27!=null )
                {
                    Article27.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 28) {
                if(Article28!=null )
                {
                    Article28.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 29) {
                if(Article29!=null )
                {
                    Article29.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 30) {
                if(Article30!=null )
                {
                    Article30.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 31) {
                if(Article31!=null )
                {
                    Article31.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            } else if (i == 32) {
                if(Article32!=null )
                {
                    Article32.setText(nom+"("+quantite+"): "+String.valueOf(prix)+"€");
                }
            }
        }

    }

    public void add1(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(1));
    }

    public void add2(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(2));
    }

    public void add3(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(3));
    }

    public void add4(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(4));
    }

    public void add5(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(5));
    }

    public void add6(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(6));
    }

    public void add7(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(7));
    }

    public void add8(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(8));
    }

    public void add9(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(9));
    }

    public void add10(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(10));
    }

    public void add11(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(11));
    }

    public void add12(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(12));
    }

    public void add13(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(13));
    }

    public void add14(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(14));
    }

    public void add15(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(15));
    }

    public void add16(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(16));
    }

    public void add17(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(17));
    }

    public void add18(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(18));
    }

    public void add19(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(19));
    }

    public void add20(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(20));
    }

    public void add21(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(21));
    }

    public void add22(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(22));
    }

    public void add23(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(23));
    }

    public void add24(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(24));
    }

    public void add25(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(25));
    }

    public void add26(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(26));
    }

    public void add27(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(27));
    }

    public void add28(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(28));
    }

    public void add29(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(29));
    }

    public void add30(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(30));
    }

    public void add31(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(31));
    }

    public void add32(ActionEvent event) {

        panier.addPanier(articleDao.getArticleById(32));
    }


    public void dirFruit(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Fruit.fxml"));
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

    public void dirShopping(ActionEvent event) {

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

    public void dirLegume(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Legume.fxml"));
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

    public void voirpanier(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("panier.fxml"));
            root = loader.load();
            paniercontroller test = loader.getController();
            test.getPanier(panier);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void dirlogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
// permet de conserver le texte dans le panier
    public void getPanier2(Panier panier){
        this.panier=panier;


    }





}