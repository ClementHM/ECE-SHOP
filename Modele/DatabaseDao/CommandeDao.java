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

    @Override
    public void Ajout() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Commande commande= new Commande();

        try {
            connection = daoFactory.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO commande (id, date, id_client, total, payé) VALUES (?,?, ?, ?, ?)");
            preparedStatement.setInt(1,13);
            preparedStatement.setDate(2, Date.valueOf("2023-05-02"));
            preparedStatement.setInt(3, 5);
            preparedStatement.setInt(4, 25);
            preparedStatement.setInt(5, 1);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

