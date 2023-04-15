package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.InterfaceClient;
import Modele.Table.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao implements InterfaceClient {
    private DaoFactory daoFactory;

    public ClientDao(DaoFactory daoFactory) {

        this.daoFactory = daoFactory;
    }

    @Override
    public List<Client> Connexion() {
        List<Client> listerclient = new ArrayList<Client>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(("select* from client"));

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prénom = rs.getString("prénom");
                String adresse = rs.getString("adresse");
                String email= rs.getString("email");
                String password = rs.getString("password");



                Client client= new Client();
                client.setId(id);
                client.setNom(nom);
                client.setPrénom(prénom);
                client.setAdresse(adresse);
                client.setEmail(email);
                client.setPassword(password);


                listerclient.add(client);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*System.out.println("Liste des clients: ");
        System.out.println("----------------------------------------------------");
        for (Client element : listerclient) {
            System.out.println(element);
            System.out.println("----------------------------------------------------");

        }*/
        return listerclient;

    }
        @Override
    public void saveClient(String nom, String prenom, String adresse, String email, String password) {
        try {
            Connection conn = daoFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO client (nom, prénom, adresse,email,password) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, adresse);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Le nouvel ID est : " + id);

                System.out.println("Client ajouté à la base de données");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  /*  @Override
    public Client creationcompte(ActionEvent event, String nom, String prénom, String adresse, String email, String password) {
        try {
            Connection connection = daoFactory.getConnection();
            PreparedStatement check = connection.prepareStatement
                    ("select * from client where email = ?");
            check.setString(1, email);

            ResultSet resultSet = check.executeQuery();

            if (resultSet.isBeforeFirst()) {
                System.out.println("Mail déjà inscrit");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Vous pouvez pas utiliser cet email");
                alert.show();
            } else {
                PreparedStatement insert = connection.prepareStatement("INSERT INTO client (nom, prénom, adresse, email, password VALUES (?,?,?,?,?)");
                insert.setString(1, nom);
                insert.setString(2, prénom);
                insert.setString(3, adresse);
                insert.setString(4, email);
                insert.setString(5, password);
                insert.executeQuery();
            }


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }


        return null;
    }*/
}