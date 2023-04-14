package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.InterfaceClient;
import Modele.Table.Client;
import javafx.scene.control.Alert;

import java.awt.event.ActionEvent;
import java.sql.*;

public class ClientDao implements InterfaceClient {
    private DaoFactory daoFactory;

    public ClientDao(DaoFactory daoFactory) {

        this.daoFactory = daoFactory;
    }

    @Override
    public void saveClient(String nom, String prénom, String adresse, String ville, String pays, String email) {
        try {
            Connection conn = daoFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO client (nom, prénom, adresse,ville, pays, email) VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nom);
            ps.setString(2, prénom);
            ps.setString(3, adresse);
            ps.setString(4, ville);
            ps.setString(5, pays);
            ps.setString(6, email);
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

    @Override
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
    }
}