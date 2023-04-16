package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.InterfaceCommande;
import Modele.Table.Commande;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommandeDao implements InterfaceCommande {
    private DaoFactory daoFactory;

    public CommandeDao(DaoFactory daoFactory) {

        this.daoFactory = daoFactory;
    }

//affiche la liste de commande pour un client donné
    @Override
    public List<Commande> CommandeClient(int idclient) {
        List<Commande> listecommandeclient = new ArrayList<Commande>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            rs= statement.executeQuery(("SELECT * FROM commande WHERE id_client = " + idclient));

            while(rs.next()) {
                int id = rs.getInt("id");
                Date date = rs.getDate("date");
                idclient = rs.getInt("id_client");
                int total= rs.getInt("total");
                int payé= rs.getInt("payé");

                Commande commande =new Commande();
                commande.setId(id);
                commande.setDate(date);
                commande.setIdclient(idclient);
                commande.setTotal(total);
                commande.setPayé(payé);

                listecommandeclient.add(commande);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Liste des commandes pour ce client avec id: "+idclient);
        System.out.println("----------------------------------------------------");
        for (Commande element: listecommandeclient){
            System.out.println(element);
            System.out.println("----------------------------------------------------");


        }
        return listecommandeclient;


    }

    // permet d'enregistrer une commande dans la bdd
    @Override
    public void saveCommande(java.sql.Timestamp timestamp, int idclient, int total, int payé) {
        try {
            Connection connection = daoFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO commande (date, id_client, total, payé) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setTimestamp(1, timestamp);
            preparedStatement.setInt(2, idclient);
            preparedStatement.setInt(3, total);
            preparedStatement.setInt(4, payé);
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Le nouvel ID est : " + id);

                System.out.println("Commande ajouté à la base de données");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

