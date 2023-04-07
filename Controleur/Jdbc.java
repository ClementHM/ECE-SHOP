package Controleur;
import java.sql.*;

public class Jdbc {

    void lectureEmployé() {
        String sql = "SELECT* from employé";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "abcdef");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void lectureArticle() {
        String sql = "SELECT* from article";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "abcdef");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("nom"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());


        }
    }
}
