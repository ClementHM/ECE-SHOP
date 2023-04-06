package Controleur;
import java.sql.*;

public class Jdvc {

    void lectureArticle(){
        String sql = "SELECT article FROM Shopping";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eceshopping", "root", "");
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.println(rs.getString("article"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
