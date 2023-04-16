package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.InterfaceDetailCommande;
import Modele.Table.Detailcommande;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetailcoDao implements InterfaceDetailCommande {
    private DaoFactory daoFactory;

    public DetailcoDao(DaoFactory daoFactory) {

        this.daoFactory = daoFactory;
    }
    //nous permet d'afficher tous details des commandes, finalement pas utilisé
    @Override
    public List<Detailcommande> CommandeParArticle(int idarticle) {
        List<Detailcommande> commandearticle = new ArrayList<Detailcommande>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            rs= statement.executeQuery(("SELECT * FROM détail_de_commande WHERE id_article = " + idarticle));

            while(rs.next()) {
                int id = rs.getInt("id");
                int idcommande= rs.getInt("id_commande");
                idarticle = rs.getInt("id_article");
                int quantité= rs.getInt("quantité");
                float prixunitaire= rs.getFloat("prix_unitaire");
                float prixtotal = rs.getFloat("prix_total");

                Detailcommande detailcommande=new Detailcommande();
                detailcommande.setId(id);
                detailcommande.setIdcommande(idcommande);
                detailcommande.setIdarticle(idarticle);
                detailcommande.setQuantité(quantité);
                detailcommande.setPrixunitaire(prixunitaire);
                detailcommande.setPrixtotal(prixtotal);

                commandearticle.add(detailcommande);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Liste des commandes pour l'article avec id: "+idarticle);
        System.out.println("----------------------------------------------------");
        for (Detailcommande element: commandearticle){
            System.out.println(element);
            System.out.println("----------------------------------------------------");


        }
        return commandearticle;


    }

    }

