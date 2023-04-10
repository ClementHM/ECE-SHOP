package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.InterfaceClient;
import Modele.Table.Client;
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
                PreparedStatement ps = conn.prepareStatement("INSERT INTO client (nom, prénom, adresse,ville, pays, email) VALUES (?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, nom);
                ps.setString(2, prénom);
                ps.setString(3, adresse);
                ps.setString(4,ville);
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
    }
