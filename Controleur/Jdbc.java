package Controleur;
import java.sql.*;

public class Jdbc {

    void lectureEmployé(){
        String sql = "SELECT* from employé";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eceshopping", "root", "abcdef");
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.println(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
