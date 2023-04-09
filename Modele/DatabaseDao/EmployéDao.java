package Modele.DatabaseDao;

import Modele.DatabaseDao.Interfaces.Interfaceemployé;
import Modele.Table.Employé;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployéDao implements Interfaceemployé {
    private DaoFactory daoFactory;
    public EmployéDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Employé getEmployeById(int id) {
        try {
            Connection connection = daoFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement
                    ("select * from employé where id = ?");
            statement.setLong(1,id);

            ResultSet resultSet = statement.executeQuery();

            Employé employé = new Employé();

            while (resultSet.next()){
                employé.setId(resultSet.getInt("id"));
                employé.setNom(resultSet.getString("nom"));
                employé.setPrénom(resultSet.getString("prénom"));
                employé.setEmail(resultSet.getString("email"));
                employé.setMotdepasse(resultSet.getString("mot_de_passe"));


            }
            System.out.println(employé);
            return employé ;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Employé> lister() {
        List<Employé> listeemployés = new ArrayList<Employé>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            rs= statement.executeQuery(("select* from employé"));

            while(rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prénom = rs.getString("prénom");
                String email= rs.getString("email");
                String motdepasse= rs.getString("mot_de_passe");

                Employé employé =new Employé();
                employé.setId(id);
                employé.setNom(nom);
                employé.setPrénom(prénom);
                employé.setEmail(email);
                employé.setMotdepasse(motdepasse);

                listeemployés.add(employé);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Liste des employés: ");
        System.out.println("----------------------------------------------------");
        for (Employé element: listeemployés){
            System.out.println(element);
            System.out.println("----------------------------------------------------");


        }
        return listeemployés;

    }
}
